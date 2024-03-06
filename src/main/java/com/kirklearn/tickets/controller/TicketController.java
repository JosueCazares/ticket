package com.kirklearn.tickets.controller;

import com.kirklearn.tickets.model.Ticket;
import com.kirklearn.tickets.rest.TicketRest;
import com.kirklearn.tickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public String viewTickets(Model model) {
        List<Ticket> tickets = ticketService.list();
        model.addAttribute("tickets", tickets);
        return "html/tickets";
    }
    

    

}
