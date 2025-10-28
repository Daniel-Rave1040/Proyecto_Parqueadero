package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sedes")
@Getter
@Setter
@NoArgsConstructor

public class SedeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sede;

    private Character nombre;
    private Character direccion;

    @ManyToOne
    @JoinColumn (name = "id_ciudad")
    private CiudadEntity ciudad;

    @OneToMany(mappedBy = "sede")
    private List<CeldaEntity> celdas;

    @ManyToOne
    @JoinColumn (name = "id_parking")
    private ParkingExpressEntity parkingExpress ;




}
