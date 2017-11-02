package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.School.SCHOOL;

import org.jooq.Record;
import org.jooq.RecordMapper;
import com.csc680.orbit.model.School;

public class SchoolRecordMapper implements RecordMapper<Record, School> {

	public School map(Record r) {
		return new School(
				r.getValue(SCHOOL.ID), 
				r.getValue(SCHOOL.NAME),
				r.getValue(SCHOOL.ADDRESS_1),
				r.getValue(SCHOOL.ADDRESS_2),
				r.getValue(SCHOOL.CITY), 
				r.getValue(SCHOOL.STATE),
				r.getValue(SCHOOL.ZIP_CODE));
	}

}
