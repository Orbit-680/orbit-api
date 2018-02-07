package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Assignment.ASSIGNMENT;
import static com.csc680.orbit.database.tables.Course.COURSE;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Assignment;
import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Teacher;

public class AssignmentRecordMapper implements RecordMapper<Record, Assignment>{
	public Assignment map(Record r) {
		Course course = new Course();
		
		try{
			course = new Course(r.getValue(ASSIGNMENT.COURSE_ID));
		}catch (NullPointerException e){
	
		}
		
		return new Assignment(
				r.getValue(ASSIGNMENT.ID), 
				r.getValue(ASSIGNMENT.YEAR),
				r.getValue(ASSIGNMENT.NAME),
				r.getValue(ASSIGNMENT.TYPE),
				r.getValue(ASSIGNMENT.MAX_POINTS),
				course);
	}

}
