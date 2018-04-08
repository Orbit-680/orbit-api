package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.CONDUCT;
import static com.csc680.orbit.database.Tables.COURSE;
import static com.csc680.orbit.database.Tables.GRADE;
import static com.csc680.orbit.database.Tables.STUDENT;
import static com.csc680.orbit.database.Tables.TEACHER;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import com.csc680.orbit.model.dto.CreateCourseDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Teacher;
import com.csc680.orbit.recordmapper.AssignmentRecordMapper;
import com.csc680.orbit.recordmapper.ConductRecordMapper;
import com.csc680.orbit.recordmapper.CourseRecordMapper;
import com.csc680.orbit.recordmapper.GradeRecordMapper;
import com.csc680.orbit.repository.ConductRepository;
import com.csc680.orbit.repository.CourseRepository;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.service.TeacherService;
import com.csc680.orbit.service.impl.TeacherServiceImpl;
import com.csc680.orbit.utils.Constants;

import java.util.logging.Logger;
import javassist.bytecode.stackmap.TypeData.ClassName;

@Repository ("conductRepository")
public class ConductRepositoryImpl implements ConductRepository {
	
	
	DSLContext dslContext = DBConnection.getConnection();
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Override
	public <S extends Conduct> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Conduct> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conduct findOne(String id) {
		List<Conduct> conducts= new ArrayList<Conduct>();
		int conductID = Integer.parseInt(id);
		conducts = this.dslContext.select(
				CONDUCT.ID,
				CONDUCT.YEAR,
				CONDUCT.DATE,
				CONDUCT.SCORE, 
				CONDUCT.COMMENT,
				CONDUCT.COURSE_ID,
				CONDUCT.STUDENT_ID)
				.from(CONDUCT)
				.where(CONDUCT.ID.eq(conductID))
				.fetch()
				.map(new ConductRecordMapper());
		
		return conducts.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean conductExists = false;
		int conductID = Integer.parseInt(id);
		int conductCount = this.dslContext
				.selectCount()
				.from(CONDUCT)
				.where(CONDUCT.ID.eq(conductID))
				.fetchOne(0, int.class);
		
		if (conductCount != 0) {
			conductExists = true;
		}
		
		return conductExists;
	}

	@Override
	public Iterable<Conduct> findAll() {
		List<Conduct> conduct = new ArrayList<Conduct>();
		conduct = this.dslContext.select(
				CONDUCT.ID,
				CONDUCT.YEAR,
				CONDUCT.DATE,
				CONDUCT.SCORE, 
				CONDUCT.COMMENT,
				CONDUCT.COURSE_ID,
				CONDUCT.STUDENT_ID)
				.from(CONDUCT)
				.fetch()
				.map(new ConductRecordMapper());
		return conduct;
	}

	@Override
	public Iterable<Conduct> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int courseCount = 0;
		courseCount = this.dslContext
				.selectCount()
				.from(CONDUCT)
				.fetchOne(0, int.class);
		
		return courseCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Conduct entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Conduct> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Conduct> findAllConductForCourse(int courseID) {
		java.sql.Date currentDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		
		LOGGER.info("CURRENT DATE: " + currentDate.toString());
		
		List<Conduct> conducts = new ArrayList<Conduct>();
		conducts = this.dslContext.select(
				CONDUCT.ID,
				CONDUCT.YEAR,
				CONDUCT.DATE,
				CONDUCT.SCORE, 
				CONDUCT.COMMENT,
				SCHEDULE.COURSE_ID,
				STUDENT.ID,
				STUDENT.FIRST_NAME,
				STUDENT.LAST_NAME)
				.from(SCHEDULE)
				.join(STUDENT).on(STUDENT.ID.eq(SCHEDULE.STUDENT_ID))
				.leftJoin(CONDUCT).on(CONDUCT.STUDENT_ID.eq(SCHEDULE.STUDENT_ID)).and(CONDUCT.COURSE_ID.eq(SCHEDULE.COURSE_ID)).and(CONDUCT.DATE.eq(currentDate))
				.where(SCHEDULE.COURSE_ID.eq(courseID))
				.fetch()
				.map(new ConductRecordMapper());
		return conducts;
	}
	
	public boolean saveConduct(Conduct conduct) {
		boolean result = true;
		
		if(conduct.getScore() == 0)
			return true;
		
		if(conduct.getUpdateType() == "U")
			this.updateConduct(conduct);
		else
			this.save(conduct);
		
		return result;
	}
	
	/**
	 * updateConduct - Update an existing conduct record in the database.
	 * @param entity
	 * @return
	 */
	public void updateConduct(Conduct entity) {
		// TODO Auto-generated method stub
		int score = entity.getScore();
		int conductID = entity.getConductId();
		
		int result = this.dslContext.update(CONDUCT)
						.set(CONDUCT.SCORE, score)
						.where(CONDUCT.ID.eq(conductID))
						.execute();
		
		if(result != 0){
			LOGGER.info("Successfully updated Conduct to DB: " + conductID);
		}
		
	}
	
	/*public List<Course> findAllAssociatedWithTeacher(String teacherId) {
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
	}*/
}
