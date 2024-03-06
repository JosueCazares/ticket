package com.kirklearn.tickets.rest;

import com.kirklearn.tickets.model.Persona;
import com.kirklearn.tickets.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaRest {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/list")
    public List<Persona> list() {
        return personaService.list();
    }

    @PostMapping("/create")
    public Persona create(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @GetMapping("/find")
    public Persona read(@RequestParam("id") Long id) {
        return personaService.find(id);
    }

    @PutMapping("/update")
    public Persona update(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        personaService.delete(id);
    }
}
