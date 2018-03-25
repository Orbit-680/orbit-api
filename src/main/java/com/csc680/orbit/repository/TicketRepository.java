package com.csc680.orbit.repository;

import com.csc680.orbit.model.pojo.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, String> {

//    List<Ticket> addTicket(String userID);

}
