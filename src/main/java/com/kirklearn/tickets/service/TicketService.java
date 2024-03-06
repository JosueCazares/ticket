package com.kirklearn.tickets.service;

import com.kirklearn.tickets.model.Ticket;
import com.kirklearn.tickets.repository.TicketRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> list() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket find(Long id) {
        return ticketRepository.findById(id).get();
    }

    public void delete(Long id) {
        ticketRepository.deleteById(id);
    }
}
