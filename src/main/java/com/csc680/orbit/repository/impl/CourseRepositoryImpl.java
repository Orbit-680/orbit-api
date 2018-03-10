package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.ASSIGNMENT;
import static com.csc680.orbit.database.Tables.COURSE;
import static com.csc680.orbit.database.Tables.TEACHER;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Teacher;
import com.csc680.orbit.recordmapper.AssignmentRecordMapper;
import com.csc680.orbit.recordmapper.CourseRecordMapper;
import com.csc680.orbit.repository.CourseRepository;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.service.TeacherService;
import com.csc680.orbit.service.impl.TeacherServiceImpl;
import com.csc680.orbit.utils.Constants;

import java.util.logging.Logger;
import javassist.bytecode.stackmap.TypeData.ClassName;

@Repository ("courseRepository")
public class CourseRepositoryImpl implements CourseRepository {
	
	
	DSLContext dslContext = DBConnection.getConnection();
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Override
	public <S extends Course> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Course> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findOne(String id) {
		List<Course> courses= new ArrayList<Course>();
		int courseID = Integer.parseInt(id);
		courses = this.dslContext.select(
				COURSE.ID,
				COURSE.NAME,
				COURSE.YEAR,
				COURSE.TEACHER_ID)
				.from(COURSE)
				.where(COURSE.ID.eq(courseID))
				.fetch()
				.map(new CourseRecordMapper());
		
		return courses.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean courseExists = false;
		int courseID = Integer.parseInt(id);
		int courseCount = this.dslContext
				.selectCount()
				.from(COURSE)
				.where(COURSE.ID.eq(courseID))
				.fetchOne(0, int.class);
		
		if (courseCount != 0) {
			courseExists = true;
		}
		
		return courseExists;
	}

	@Override
	public Iterable<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		courses = this.dslContext.select(
				COURSE.ID,
				COURSE.NAME,
				COURSE.YEAR,
				COURSE.TEACHER_ID)
				.from(COURSE)
				.fetch()
				.map(new CourseRecordMapper());
		return courses;
	}

	@Override
	public Iterable<Course> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int courseCount = 0;
		courseCount = this.dslContext
				.selectCount()
				.from(COURSE)
				.fetchOne(0, int.class);
		
		return courseCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Course entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Course> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Course> findAllAssociatedWithTeacher(String teacherId) {
		List<Course> courses = new ArrayList<Course>();
		int tId = Integer.parseInt(teacherId);
		courses = this.dslContext.select(
				COURSE.ID,
				COURSE.NAME,
				COURSE.YEAR,
				COURSE.TEACHER_ID)
				.from(COURSE)
				.where(COURSE.TEACHER_ID.eq(tId))
				.fetch()
				.map(new CourseRecordMapper());
		return courses;
	}
	
	public String assignCoursesToTeacher(List<Course> courseList, String teacherId){
		int tId = Integer.parseInt(teacherId);
		for(Course c : courseList){
			this.dslContext.update(COURSE)
				.set(COURSE.TEACHER_ID, tId)
			    .where(COURSE.ID.eq(c.getCourseId()))
			    .execute();
		}
		return Constants.SUCCESS_STATUS;
		
	}
	
	public Course createCourse(CreateCourseDTO createCourseDTO) {
		
		//look up teacher ID by UID
		//TeacherServiceImpl teacherServiceImpl = new TeacherServiceImpl();
		//Teacher teacher = teacherServiceImpl.getTeacherByUid(createCourseDTO.getUID());
		String courseName = createCourseDTO.getName();
		int teacherID = createCourseDTO.getTeacherID();
		String year = "1718";
		
		Course iCourse = this.dslContext.insertInto(COURSE, 
							COURSE.YEAR,
							COURSE.NAME,
							COURSE.TEACHER_ID)
			        .values(year, 
			        		courseName,
			        		teacherID)
			        .returning(COURSE.ID, COURSE.NAME)
			        .fetchOne()
			        .map(new CourseRecordMapper());

		Course newCourse = (Course)iCourse;
		newCourse.setCourseId(iCourse.getCourseId());
		newCourse.setName(iCourse.getName());
		newCourse.setTeacher(iCourse.getTeacher());
		
		if(newCourse != null){
			LOGGER.info("Successfully added Course to DB: " + newCourse.toString());
		}
		return newCourse;
	}
}
