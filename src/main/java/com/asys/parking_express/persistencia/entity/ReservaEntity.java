package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reservas")
@Getter
@Setter
@NoArgsConstructor

public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reserva;

    private Character fecha_hora_reserva;
    private Character fecha_hora_entrada;
    private Character fecha_hora_salida;

    @ManyToOne
    @JoinColumn (name = "id_cliente")
    private ClienteEntity cliente ;

    @OneToOne(mappedBy = "reserva")
    private PagoEntity pago;

}
