package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Course.COURSE;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.CourseGrade;
import com.csc680.orbit.model.pojo.Teacher;

public class CourseGradeRecordMapper implements RecordMapper<Record, CourseGrade> {

	public CourseGrade map(Record r) {
		Course course = new Course();
		
		try{
			course = new Course(r.getValue(COURSE.ID), r.getValue(COURSE.NAME));
		}catch (NullPointerException e){
	
		}
		
		return new CourseGrade(
				(r.get(2) == null) ? "0" : r.get(2).toString(),
				Integer.parseInt(r.get(3).toString()),
				course
				);
	}
}
