package com.csc680.orbit.service.impl;

import com.csc680.orbit.model.pojo.Ticket;
import com.csc680.orbit.repository.TicketRepository;
import com.csc680.orbit.service.TicketService;

import javassist.bytecode.stackmap.TypeData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("ticketService")
public class TicketServiceImpl implements TicketService{

    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket addTicket(Ticket ticket) {
        Ticket newTicket = ticketRepository.save(ticket);
        return newTicket;
    }
    
    @Override
	public List<Ticket> getAllTickets() {
		List<Ticket> tickets = (List<Ticket>) ticketRepository.findAll();
		return tickets;
	}
}
