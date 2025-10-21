package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "parkingexpress")
@Getter
@Setter
@NoArgsConstructor

public class ParkingExpressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_parking;

    private Character nombre;
    private Character direccion;
    private Character telefono;
}
