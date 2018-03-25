package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Grade.GRADE;
import static com.csc680.orbit.database.tables.Course.COURSE;
import static com.csc680.orbit.database.tables.Assignment.ASSIGNMENT;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.Assignment;

public class StudentGradeRecordMapper implements RecordMapper<Record, Grade> {

	public Grade map(Record r) {
		Student student = new Student();
		Course course = new Course();
		Assignment assignment = new Assignment();
		
		try{
			student = new Student(r.getValue(GRADE.STUDENT_ID));
			course = new Course(r.getValue(GRADE.COURSE_ID));
			assignment = new Assignment(r.getValue(GRADE.ASSIGNMENT_ID), course);
			assignment.setName(r.getValue(ASSIGNMENT.NAME));
			assignment.setDescription(r.getValue(ASSIGNMENT.DESCRIPTION));
		}catch (NullPointerException e){
	
		}
		
		return new Grade(
				r.getValue(GRADE.ID),
				r.getValue(GRADE.GRADE_),
				r.getValue(COURSE.YEAR),
				student,
				course,
				assignment,
				'U'
				);
	}
}
