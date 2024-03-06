package com.kirklearn.tickets.service;

import com.kirklearn.tickets.model.Ticket;
import com.kirklearn.tickets.model.Usuario;
import com.kirklearn.tickets.repository.TicketRepository;
import com.kirklearn.tickets.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> list() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario find(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
