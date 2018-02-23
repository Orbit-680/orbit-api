package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.GRADE;
import static com.csc680.orbit.database.Tables.COURSE;
import static com.csc680.orbit.database.Tables.STUDENT;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.jooq.DSLContext;

import com.csc680.orbit.model.dto.AccountDetailsDTO;
import com.csc680.orbit.model.dto.EnrollStudentInClassDTO;
import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Schedule;
import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.recordmapper.AssignmentRecordMapper;
import com.csc680.orbit.recordmapper.CourseRecordMapper;
import com.csc680.orbit.recordmapper.GradeRecordMapper;
import com.csc680.orbit.recordmapper.ScheduleRecordMapper;
import com.csc680.orbit.recordmapper.StudentRecordMapper;
import com.csc680.orbit.recordmapper.UserRecordMapper;
import com.csc680.orbit.repository.AssignmentRepository;
import com.csc680.orbit.repository.GradeRepository;
import com.csc680.orbit.repository.UserRepository;
import com.csc680.orbit.service.DBConnection;
import com.csc680.orbit.utils.Constants;

import javassist.bytecode.stackmap.TypeData.ClassName;

public class GradeRepositoryImpl implements GradeRepository {

	DSLContext dslContext = DBConnection.getConnection();
	private static final Logger LOGGER = Logger.getLogger(ClassName.class.getName());

	@Override
	public <S extends Grade> S save(S entity) {
		// TODO Auto-generated method stub
		String grade = entity.getGrade();
		String year = "1718";
		int studentID = entity.getStudent().getStudentId();
		int courseID = entity.getCourse().getCourseId();
		int assignmentID = entity.getAssignment().getAssignmentId();
		
		this.dslContext.insertInto(GRADE, 
								GRADE.GRADE_,
								GRADE.YEAR,
								GRADE.STUDENT_ID,
								GRADE.COURSE_ID,
								GRADE.ASSIGNMENT_ID)
			        .values(grade, 
			        		year,
			        		studentID,
			        		courseID,
			        		assignmentID)
			        .returning(GRADE.ID)
			        .execute();

		Grade newGrade = (Grade)entity;
		//newAssignment.setAssignmentId(iAssignment.getAssignmentId());
		//newAssignment.setCourse(new Course(courseID));
		
		if(newGrade != null){
		LOGGER.info("Successfully added Grade to DB: " + newGrade.toString());
		}
		return (S)newGrade;
	}
	
	/**
	 * updateGrade - Update an existing grade in the database.
	 * @param entity
	 * @return
	 */
	public void updateGrade(Grade entity) {
		// TODO Auto-generated method stub
		String grade = entity.getGrade();
		int gradeID = entity.getGradeId();
		
		int result = this.dslContext.update(GRADE)
						.set(GRADE.GRADE_, grade)
						.where(GRADE.ID.eq(gradeID))
						.execute();
		
		if(result != 0){
			LOGGER.info("Successfully updated Grade to DB: " + gradeID);
		}
		
	}

	@Override
	public <S extends Grade> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Grade findOne(String id) {
		List<Grade> grades= new ArrayList<Grade>();
		int gradeID = Integer.parseInt(id);
		grades = this.dslContext.select(
				GRADE.ID,
				GRADE.GRADE_,
				GRADE.YEAR, 
				GRADE.STUDENT_ID,
				GRADE.COURSE_ID,
				GRADE.ASSIGNMENT_ID)
				.from(GRADE)
				.where(GRADE.ID.eq(gradeID))
				.fetch()
				.map(new GradeRecordMapper());
		
		return grades.get(0);
	}

	@Override
	public boolean exists(String id) {
		boolean gradeExists = false;
		int gradeID = Integer.parseInt(id);
		int gradeCount = this.dslContext
				.selectCount()
				.from(GRADE)
				.where(GRADE.ID.eq(gradeID))
				.fetchOne(0, int.class);
		
		if (gradeCount != 0) {
			gradeExists = true;
		}
		
		return gradeExists;
	}

	@Override
	public Iterable<Grade> findAll() {
		List<Grade> grades = new ArrayList<Grade>();
		grades = this.dslContext.select(
				GRADE.ID,
				GRADE.GRADE_,
				GRADE.YEAR, 
				GRADE.STUDENT_ID,
				GRADE.COURSE_ID,
				GRADE.ASSIGNMENT_ID)
				.from(GRADE)
				.fetch()
				.map(new GradeRecordMapper());
		return grades;
	}
	
	@Override
	public List<Grade> findAllGradesForAssignment(int courseID, int assignmentID) {
		/*select * from orbit.schedule
		join orbit.student on schedule.Student_ID = student.ID
		left join orbit.grade on student.ID = grade.ID and grade.Assignment_ID = 1
		where schedule.Course_ID = 1*/
		
		List<Grade> grades = new ArrayList<Grade>();
		grades = this.dslContext.select(
				GRADE.ID,
				GRADE.GRADE_,
				GRADE.YEAR,
				GRADE.STUDENT_ID,
				GRADE.COURSE_ID,
				GRADE.ASSIGNMENT_ID,
				STUDENT.ID,
				STUDENT.FIRST_NAME,
				STUDENT.LAST_NAME,
				SCHEDULE.COURSE_ID)
				.from(SCHEDULE)
				.join(STUDENT).on(STUDENT.ID.eq(SCHEDULE.STUDENT_ID))
				.leftJoin(GRADE).on(GRADE.STUDENT_ID.eq(STUDENT.ID)).and(GRADE.ASSIGNMENT_ID.eq(assignmentID))
				.where(SCHEDULE.COURSE_ID.eq(courseID))
				.fetch()
				.map(new GradeRecordMapper());
		return grades;
	}
	
	public boolean saveGrade(Grade grade)
	{
		boolean result = true;
		
		if(grade.getUpdateType() == 'U')
			this.updateGrade(grade);
		else
			this.save(grade);
		
		return result;
	}

	@Override
	public Iterable<Grade> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		int gradeCount = 0;
		gradeCount = this.dslContext
				.selectCount()
				.from(GRADE)
				.fetchOne(0, int.class);
		return gradeCount;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Grade entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Grade> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
