package com.asys.parking_express.persistencia.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departamentos")
@Getter
@Setter
@NoArgsConstructor

public class DepartamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_departamento;

    private Character nombre;
    @ManyToOne
    @JoinColumn (name = "id_pais")
    private PaisEntity pais;
}
