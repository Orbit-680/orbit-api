package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Student.STUDENT;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.SearchedStudent;

public class SearchedStudentRecordMapper implements RecordMapper<Record, SearchedStudent>
{
    public SearchedStudent map(Record r)
    {
        return new SearchedStudent(
				r.getValue(STUDENT.FIRST_NAME),
				r.getValue(STUDENT.LAST_NAME),
				r.getValue(STUDENT.DATE_OF_BIRTH),
           			r.getValue(STUDENT.SSN)
				);
    }
}
