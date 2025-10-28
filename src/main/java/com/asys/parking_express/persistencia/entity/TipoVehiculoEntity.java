package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tiposvehiculos")
@Getter
@Setter
@NoArgsConstructor
public class TipoVehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_vehiculo;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "tipoVehiculo")
    private List<VehiculoEntity> vehiculo;
}
