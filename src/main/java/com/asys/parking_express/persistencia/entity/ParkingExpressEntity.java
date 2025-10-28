package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "parkingexpress")
@Getter
@Setter
@NoArgsConstructor

public class ParkingExpressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_parking;

    private String nombre;
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "parkingExpress")
    private List<SedeEntity> sedes;

    @OneToMany(mappedBy = "parkingExpress")
    private List<EmpleadoEntity> empleados;

    @OneToMany(mappedBy = "parkingExpress")
    private List<ClienteEntity> clientes;



}
