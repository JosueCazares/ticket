package com.kirklearn.tickets.rest;

import com.kirklearn.tickets.model.Estacion;
import com.kirklearn.tickets.model.Persona;
import com.kirklearn.tickets.service.EstacionService;
import com.kirklearn.tickets.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estacion")
public class EstacionRest {
    @Autowired
    private EstacionService estacionService;

    @GetMapping("/list")
    public List<Estacion> list() {
        return estacionService.list();
    }

    @PostMapping("/create")
    public Estacion create(@RequestBody Estacion estacion) {
        return estacionService.save(estacion);
    }

    @GetMapping("/find")
    public Estacion read(@RequestParam("id") Long id) {
        return estacionService.find(id);
    }

    @PutMapping("/update")
    public Estacion update(@RequestBody Estacion estacion) {
        return estacionService.save(estacion);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        estacionService.delete(id);
    }
}
