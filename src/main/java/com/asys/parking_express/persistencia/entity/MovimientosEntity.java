package com.asys.parking_express.persistencia.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "movimientos")
@Getter
@Setter
@NoArgsConstructor

public class MovimientosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_movimiento;

    private String tipo_movimiento;

    @OneToMany(mappedBy = "movimientos")
    private List<TurnoEmpleadoEntity> turnosempleados;
}
