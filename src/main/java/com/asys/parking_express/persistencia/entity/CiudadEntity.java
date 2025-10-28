package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ciudades")
@Getter
@Setter
@NoArgsConstructor

public class CiudadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ciudad;

    private String nombre;

    @ManyToOne
    @JoinColumn (name = "id_departamento")
    private DepartamentoEntity departamento;

    @OneToMany(mappedBy = "ciudad")
    private List<SedeEntity> sedes;
}
