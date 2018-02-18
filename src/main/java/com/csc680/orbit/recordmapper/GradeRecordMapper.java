package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Grade.GRADE;
import static com.csc680.orbit.database.tables.Course.COURSE;
import static com.csc680.orbit.database.tables.Student.STUDENT;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Grade;
import com.csc680.orbit.model.pojo.Teacher;
import com.csc680.orbit.model.pojo.Student;

public class GradeRecordMapper implements RecordMapper<Record, Grade>{
	public Grade map(Record r) {
		Student student = new Student();
		Course course = new Course();
		Assignment assignment = new Assignment();
		
		try{
			student = new Student(r.getValue(GRADE.STUDENT_ID));
			student.setStudentFirstName(r.getValue(STUDENT.FIRST_NAME));
			student.setStudentLastName(r.getValue(STUDENT.LAST_NAME));
			course = new Course(r.getValue(GRADE.COURSE_ID));
			assignment = new Assignment(r.getValue(GRADE.ASSIGNMENT_ID));
		}catch (NullPointerException e){
	
		}
		
		return new Grade(
				r.getValue(GRADE.ID), 
				r.getValue(GRADE.GRADE_),
				r.getValue(GRADE.YEAR),
				student,
				course,
				assignment);
	}

}
