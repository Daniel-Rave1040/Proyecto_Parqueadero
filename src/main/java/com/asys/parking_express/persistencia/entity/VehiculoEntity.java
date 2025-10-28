package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculos")
@Getter
@Setter
@NoArgsConstructor

public class VehiculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vehiculo;

    private Character matricula;
    private Character marca;
    private Character modelo;

    @OneToOne(mappedBy = "vehiculo")
    private CeldaEntity celda;

    @ManyToOne
    @JoinColumn (name = "id_tipo_vehiculo")
    private TipoVehiculoEntity tipoVehiculo;
}
