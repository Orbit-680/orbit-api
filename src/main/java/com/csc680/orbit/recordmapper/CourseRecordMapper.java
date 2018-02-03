package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Course.COURSE;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Course;
import com.csc680.orbit.model.pojo.Teacher;

public class CourseRecordMapper implements RecordMapper<Record, Course> {

	public Course map(Record r) {
		Teacher teacher = new Teacher(r.getValue(COURSE.TEACHER_ID));
		return new Course(
				r.getValue(COURSE.ID),
				r.getValue(COURSE.NAME),
				r.getValue(COURSE.YEAR),
				teacher
				);
	}
}
