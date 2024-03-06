package com.kirklearn.tickets.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellidoPaterno;
    @Column
    private String apellidoMaterno;
    @Column
    private String genero;
    @Column
    private String fechaNacimiento;
    @Column
    private String rfc;
    @Column
    private String domicilio;
    @Column
    private String codigoPostal;
    @Column
    private String ciudad;
    @Column
    private String estado;
    @Column
    private String telefono;
    @Column
    private String email;
    @Column
    private String foto;
}
