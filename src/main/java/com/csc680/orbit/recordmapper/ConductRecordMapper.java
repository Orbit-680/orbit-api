package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Conduct.CONDUCT;
import static com.csc680.orbit.database.tables.Course.COURSE;
import static com.csc680.orbit.database.tables.Grade.GRADE;
import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;
import static com.csc680.orbit.database.tables.Student.STUDENT;

import java.util.Calendar;
import java.util.logging.Logger;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Conduct;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Student;

import javassist.bytecode.stackmap.TypeData.ClassName;

public class ConductRecordMapper implements RecordMapper<Record, Conduct> {

	public Conduct map(Record r) {
		Course course = new Course();
		String courseName = "";
		Student student = new Student();
		String updateType = "I";
		int conductID = 0;
		String year = "";
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		int score = 0;
		String comment = "";
		final Logger LOGGER = Logger.getLogger(ClassName.class.getName());
		
		try{
			course = new Course(r.getValue(SCHEDULE.COURSE_ID));
			student = new Student(r.getValue(STUDENT.ID));
			student.setStudentFirstName(r.getValue(STUDENT.FIRST_NAME));
			student.setStudentLastName(r.getValue(STUDENT.LAST_NAME));
		}catch (NullPointerException e){
	
		}
		
		if(r.getValue(CONDUCT.SCORE) == null)
			updateType = "I";
		else
			updateType = "U";
		
		if(r.getValue(CONDUCT.ID) != null)
			conductID = r.getValue(CONDUCT.ID);
		if(CONDUCT.YEAR != null)
			year = r.getValue(CONDUCT.YEAR);
		if(CONDUCT.DATE != null)
			date = r.getValue(CONDUCT.DATE);
		if(r.getValue(CONDUCT.SCORE) != null)
			score = r.getValue(CONDUCT.SCORE);
		if(CONDUCT.COMMENT != null)
			comment = r.getValue(CONDUCT.COMMENT);
		if(COURSE.NAME != null) {
			courseName = r.getValue(COURSE.NAME);
			course.setName(courseName);
		}
		
		return new Conduct(
				conductID,
				year,
				date, 
				score, 
				comment, 
				course, 
				student,
				updateType
				);
	}
}
