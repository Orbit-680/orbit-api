package com.csc680.orbit.recordmapper;

import com.csc680.orbit.model.pojo.Ticket;
import com.csc680.orbit.model.pojo.User;
import org.jooq.Record;
import org.jooq.RecordMapper;

import static com.csc680.orbit.database.tables.Tickets.TICKETS;

public class TicketRecordMapper implements RecordMapper<Record, Ticket> {

    public Ticket map(Record r) {
        User user = new User();

        try{
            user = new User(r.getValue(TICKETS.USER_ID));
        }catch (NullPointerException e){

        }

        return new Ticket(
                r.getValue(TICKETS.ID),
                r.getValue(TICKETS.NAME),
                r.getValue(TICKETS.DESCRIPTION),
                user
        );
    }
}
