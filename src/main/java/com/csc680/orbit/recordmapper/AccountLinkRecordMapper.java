package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.AccountLinkStudent.ACCOUNT_LINK_STUDENT;
import com.csc680.orbit.model.AccountLinkStudent;
import org.jooq.Record;
import org.jooq.RecordMapper;

public class AccountLinkRecordMapper implements RecordMapper<Record,AccountLinkStudent>
{
    public AccountLinkStudent map(Record r) 
    {
        return new AccountLinkStudent(r.getValue(ACCOUNT_LINK_STUDENT.DATE_LINKED),
                           r.getValue(ACCOUNT_LINK_STUDENT.ACTIVE),
                           r.getValue(ACCOUNT_LINK_STUDENT.USER_ID),
                           r.getValue(ACCOUNT_LINK_STUDENT.STUDENT_ID));
    }
}