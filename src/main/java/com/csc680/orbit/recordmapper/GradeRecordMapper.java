package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Grade.GRADE;
import static com.csc680.orbit.database.tables.Course.COURSE;
import static com.csc680.orbit.database.tables.Student.STUDENT;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import java.util.logging.Logger;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Teacher;

import javassist.bytecode.stackmap.TypeData.ClassName;

import com.csc680.orbit.model.pojo.Student;

public class GradeRecordMapper implements RecordMapper<Record, Grade>{
	public Grade map(Record r) {
		final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
		Student student = new Student();
		Course course = new Course();
		Assignment assignment = new Assignment();
		char updateType = 'I';
		int gradeID = 0;
		String grade = "";
		String year = "";
		
		try{
			student = new Student(r.getValue(STUDENT.ID));
			student.setStudentFirstName(r.getValue(STUDENT.FIRST_NAME));
			student.setStudentLastName(r.getValue(STUDENT.LAST_NAME));
			course = new Course(r.getValue(SCHEDULE.COURSE_ID));
			
			if(STUDENT.FIRST_NAME != null)
			if(GRADE.ASSIGNMENT_ID != null)
				assignment = new Assignment(r.getValue(GRADE.ASSIGNMENT_ID), course);
			
			if(GRADE.ID != null)
				gradeID = r.getValue(GRADE.ID);
			if(GRADE.GRADE_ != null)
				grade = r.getValue(GRADE.GRADE_);
			if(GRADE.YEAR != null)
				year = r.getValue(GRADE.YEAR);
			
			if(GRADE.GRADE_ == null)
				updateType = 'I';
			else
				updateType = 'U';
		}catch (NullPointerException e){
		}
		
		return new Grade(
				gradeID, 
				grade,
				year,
				student,
				course,
				assignment,
				updateType);
	}

}
