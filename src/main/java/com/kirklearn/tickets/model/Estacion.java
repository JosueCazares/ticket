package com.kirklearn.tickets.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Estacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numEstacion;
    @Column
    private String nombreComercial;
    @Column
    private String domicilio;
    @Column
    private String telefono;
    @Column
    private String codigoPostal;
    @Column
    private String zona;
    @Column
    private int estatus;

}
