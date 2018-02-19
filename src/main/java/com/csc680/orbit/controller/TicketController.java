package com.csc680.orbit.controller;

import com.csc680.orbit.model.pojo.Ticket;
import com.csc680.orbit.service.TicketService;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@RestController
public class TicketController {
    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());

    @Autowired
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @RequestMapping(value = "/add-ticket", method = RequestMethod.POST)
    public Ticket addTicket(@RequestBody Ticket ticket, HttpServletResponse response) {
        LOGGER.info("Add ticket controller hit.");
        Ticket newTicket = ticketService.addTicket(ticket);
        return newTicket;
    }
}
