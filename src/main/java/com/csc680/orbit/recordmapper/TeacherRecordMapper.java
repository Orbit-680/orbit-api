package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Teacher.TEACHER;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.Teacher;

public class TeacherRecordMapper implements RecordMapper<Record,Teacher>{
	public Teacher map(Record r) 
    {
        return new Teacher(r.getValue(TEACHER.ID),
        				   r.getValue(TEACHER.FIRST_NAME),
                           r.getValue(TEACHER.LAST_NAME),
                           r.getValue(TEACHER.DATE_OF_BIRTH),
                           r.getValue(TEACHER.SSN),
                           r.getValue(TEACHER.ADDRESS_1),
                           r.getValue(TEACHER.ADDRESS_2),
                           r.getValue(TEACHER.CITY),
                           r.getValue(TEACHER.STATE),
                           r.getValue(TEACHER.ZIP_CODE));
    }

}
