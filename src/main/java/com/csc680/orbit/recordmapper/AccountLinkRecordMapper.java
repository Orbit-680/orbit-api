package com.csc680.orbit.recordmapper;

import static com.csc680.orbit.database.tables.AccountLink.ACCOUNT_LINK;
import com.csc680.orbit.model.AccountLink;
import org.jooq.Record;
import org.jooq.RecordMapper;

public class AccountLinkRecordMapper implements RecordMapper<Record,AccountLink>
{
    public AccountLink map(Record r) 
    {
        return new AccountLink(r.getValue(ACCOUNT_LINK.DATE_LINKED),
                           r.getValue(ACCOUNT_LINK.ACTIVE),
                           r.getValue(ACCOUNT_LINK.USER_ID),
                           r.getValue(ACCOUNT_LINK.STUDENT_ID));
    }
}