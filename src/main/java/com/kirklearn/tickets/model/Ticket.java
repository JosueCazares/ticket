package com.kirklearn.tickets.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ticket")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String fechaCreacion;
    @Column
    private String fechaCierre;
    @Column
    private String importancia;
    @Column
    private String nombreCreador;
    @Column
    private String area;
    @Column
    private String correo;
    @Column
    private String descripcion;
    @Column
    private String estatus;
    @Column
    private Integer activo;
    @Column
    private String foto;


    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
