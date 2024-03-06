package com.kirklearn.tickets.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numeroEmpleado;

    @Column
    private String usuario;

    @Column
    private String contrasenia;

    @Column
    private boolean estatus;

    @Column
    private String puesto;

    @Column
    private String correo;

    @Column
    private String rol;

    @OneToOne
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id")
    private Ticket ticket;
}
