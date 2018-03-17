package com.csc680.orbit.repository.impl;

import static com.csc680.orbit.database.Tables.TICKETS;

import com.csc680.orbit.model.pojo.Student;
import com.csc680.orbit.model.pojo.Ticket;
import com.csc680.orbit.model.pojo.User;
import com.csc680.orbit.recordmapper.StudentRecordMapper;
import com.csc680.orbit.recordmapper.TicketRecordMapper;
import com.csc680.orbit.repository.TicketRepository;
import com.csc680.orbit.service.DBConnection;

import javassist.bytecode.stackmap.TypeData;

import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Repository("ticketRepository")
public class TicketRepositoryImpl implements TicketRepository {

    DSLContext dslContext = DBConnection.getConnection();
    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());

    @Override
    public <S extends Ticket> S save(S ticket) {
        String name = ticket.getName();
        String description = ticket.getDescription();
        String priority = ticket.getPriority();
        User user = ticket.getUser();

        Ticket addTicket = this.dslContext.insertInto(TICKETS,
                TICKETS.NAME,
                TICKETS.DESCRIPTION,
                TICKETS.PRIORITY,
                TICKETS.USER_ID)
                .values(name, description, priority, user.getUserID())
                .returning(TICKETS.ID, TICKETS.NAME, TICKETS.DESCRIPTION, TICKETS.PRIORITY, TICKETS.USER_ID)
                .fetchOne()
                .map(new TicketRecordMapper());

        Ticket newTicket = (Ticket) ticket;
        newTicket.setTicketID(addTicket.getTicketID());
        if(newTicket != null){
            LOGGER.info("Successfully added Ticket to DB: " + newTicket.toString());
        }

        return (S)newTicket;
    }

    @Override
    public <S extends Ticket> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public Ticket findOne(String s) {
        return null;
    }

    @Override
    public boolean exists(String s) {
        return false;
    }

    @Override
    public Iterable<Ticket> findAll() {
    	List<Ticket> tickets = new ArrayList<Ticket>();
    	tickets = this.dslContext.select(	TICKETS.NAME,
							    			TICKETS.DESCRIPTION,
							    			TICKETS.ID,
							    			TICKETS.PRIORITY)
                             .from(TICKETS)
                             .fetch()
                             .map(new TicketRecordMapper());
        return tickets;
    }

    @Override
    public Iterable<Ticket> findAll(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void delete(Ticket entity) {

    }

    @Override
    public void delete(Iterable<? extends Ticket> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
