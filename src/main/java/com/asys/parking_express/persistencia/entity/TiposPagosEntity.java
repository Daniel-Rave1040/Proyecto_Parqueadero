package com.asys.parking_express.persistencia.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipospagos")
@Getter
@Setter
@NoArgsConstructor

public class TiposPagosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_pago;

    private Character nombre;
}
