package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.AccountLinkStudent.ACCOUNT_LINK_STUDENT;

import org.jooq.Record;
import org.jooq.RecordMapper;

import com.csc680.orbit.model.pojo.AccountLinkStudent;

public class AccountLinkRecordMapper implements RecordMapper<Record,AccountLinkStudent>
{
    public AccountLinkStudent map(Record r) 
    {
        return new AccountLinkStudent(r.getValue(ACCOUNT_LINK_STUDENT.ACTIVE),
                           r.getValue(ACCOUNT_LINK_STUDENT.USER_ID),
                           r.getValue(ACCOUNT_LINK_STUDENT.STUDENT_ID));
    }
}