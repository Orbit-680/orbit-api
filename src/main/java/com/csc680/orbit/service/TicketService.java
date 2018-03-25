package com.csc680.orbit.service;

import java.util.List;

import com.csc680.orbit.model.pojo.Ticket;

public interface TicketService {
    Ticket addTicket(Ticket ticket);
    List<Ticket> getAllTickets();
}
