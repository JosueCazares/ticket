package com.kirklearn.tickets.service;

import com.kirklearn.tickets.model.Persona;
import com.kirklearn.tickets.model.Ticket;
import com.kirklearn.tickets.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> list() {
        return (List<Persona>) personaRepository.findAll();
    }
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona find(Long id) {
        return personaRepository.findById(id).get();
    }

    public void delete(Long id) {
        personaRepository.deleteById(id);
    }
}
