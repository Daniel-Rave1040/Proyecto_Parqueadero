package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor

public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    private Character nombre;
    private Character apellido;
    private Character email;
    private Character telefono;

    @ManyToOne
    @JoinColumn (name = "id_parking")
    private ParkingExpressEntity parkingExpress ;

    @OneToMany(mappedBy = "cliente")
    private List<ReservaEntity> reservas;
}
