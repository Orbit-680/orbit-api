package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.Student.STUDENT;
import com.csc680.orbit.model.Student;
import org.jooq.Record;
import org.jooq.RecordMapper;

public class StudentRecordMapper implements RecordMapper<Record,Student>
{
    public Student map(Record r) 
    {
        return new Student(r.getValue(STUDENT.FIRST_NAME),
                           r.getValue(STUDENT.LAST_NAME),
                           r.getValue(STUDENT.ID));
    }
    
}
