package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "celdas")
@Getter
@Setter
@NoArgsConstructor

public class CeldaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_celda;

    private String nombre;
    private String estado;

    @ManyToOne
    @JoinColumn (name = "id_sede")
    private SedeEntity sede;

    @OneToOne
    @JoinColumn(name = "id_vehiculo")
    private VehiculoEntity vehiculo;


}
