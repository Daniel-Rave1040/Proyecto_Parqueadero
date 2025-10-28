package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "empleados")
@Getter
@Setter
@NoArgsConstructor

public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_empleado;

    private Character nombre;
    private Character apellido;
    private Character telefono;

    @ManyToOne
    @JoinColumn (name = "id_parking")
    private ParkingExpressEntity parkingExpress ;

    @OneToMany(mappedBy = "empleado")
    private List<TurnoEmpleadoEntity> turnosempleados;


}
