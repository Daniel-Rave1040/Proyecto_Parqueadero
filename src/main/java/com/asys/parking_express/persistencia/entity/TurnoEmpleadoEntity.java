package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "turnosempleados")
@Getter
@Setter
@NoArgsConstructor

public class TurnoEmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_turno;

    private String fecha_inicio;
    private String fecha_fin;

    @ManyToOne
    @JoinColumn (name = "id_empleado")
    private EmpleadoEntity empleado ;

    @ManyToOne
    @JoinColumn (name = "id_movimiento")
    private MovimientosEntity movimientos ;
}
