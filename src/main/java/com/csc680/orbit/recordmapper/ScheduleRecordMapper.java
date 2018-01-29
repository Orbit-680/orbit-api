package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Schedule.SCHEDULE;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.Schedule;

public class ScheduleRecordMapper implements RecordMapper<Record, Schedule>{
	public Schedule map(Record r) {
		return new Schedule(
				r.getValue(SCHEDULE.ID), 
				r.getValue(SCHEDULE.YEAR),
				r.getValue(SCHEDULE.STUDENT_ID),
				r.getValue(SCHEDULE.COURSE_ID));
	}

}
