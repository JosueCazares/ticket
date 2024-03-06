package com.kirklearn.tickets.rest;

import com.kirklearn.tickets.model.Ticket;
import com.kirklearn.tickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketRest {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/list")
    public List<Ticket> list() {
        return ticketService.list();
    }

    @PostMapping("/create")
    public Ticket create(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @GetMapping("/find")
    public Ticket read(@RequestParam("id") Long id) {
        return ticketService.find(id);
    }

    @PutMapping("/update")
    public Ticket update(@RequestBody Ticket ticket) {
        return ticketService.save(ticket);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        ticketService.delete(id);
    }
}
