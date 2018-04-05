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
		String maxPoints = "";
		double grade = 0;
		
		try{
			student = new Student(r.getValue(GRADE.STUDENT_ID));
			course = new Course(r.getValue(GRADE.COURSE_ID));
			assignment = new Assignment(r.getValue(GRADE.ASSIGNMENT_ID), course);
			assignment.setName(r.getValue(ASSIGNMENT.NAME));
			assignment.setDescription(r.getValue(ASSIGNMENT.DESCRIPTION));
			maxPoints = r.getValue(ASSIGNMENT.MAX_POINTS);
			if(maxPoints != null)
				grade = (Integer.parseInt(r.getValue(GRADE.GRADE_)) * 1.0 / Integer.parseInt(maxPoints)) * 100;
		}catch (NullPointerException e){
	
		}
		
		return new Grade(
				r.getValue(GRADE.ID),
				String.valueOf(grade),
				r.getValue(COURSE.YEAR),
				student,
				course,
				assignment,
				'U'
				);
	}
}
