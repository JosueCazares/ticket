package com.kirklearn.tickets.rest;

import com.kirklearn.tickets.model.Ticket;
import com.kirklearn.tickets.model.Usuario;
import com.kirklearn.tickets.service.TicketService;
import com.kirklearn.tickets.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/list")
    public List<Usuario> list() {
        return usuarioService.list();
    }

    @PostMapping("/create")
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping("/find")
    public Usuario read(@RequestParam("id") Long id) {
        return usuarioService.find(id);
    }

    @PutMapping("/update")
    public Usuario update(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        usuarioService.delete(id);
    }
}
