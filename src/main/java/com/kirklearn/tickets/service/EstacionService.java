package com.kirklearn.tickets.service;

import com.kirklearn.tickets.model.Estacion;
import com.kirklearn.tickets.model.Persona;
import com.kirklearn.tickets.repository.EstacionRepository;
import com.kirklearn.tickets.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class EstacionService {
    @Autowired
    private EstacionRepository estacionRepository;

    public List<Estacion> list() {
        return (List<Estacion>) estacionRepository.findAll();
    }
    public Estacion save(Estacion estacion) {
        return estacionRepository.save(estacion);
    }

    public Estacion find(Long id) {
        return estacionRepository.findById(id).get();
    }

    public void delete(Long id) {
        estacionRepository.deleteById(id);
    }
}
