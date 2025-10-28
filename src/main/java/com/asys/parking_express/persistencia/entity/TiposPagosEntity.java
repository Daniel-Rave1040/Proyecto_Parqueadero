package com.asys.parking_express.persistencia.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "tipospagos")
@Getter
@Setter
@NoArgsConstructor

public class TiposPagosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_pago;

    private String nombre;

    @OneToMany(mappedBy = "tiposPagos")
    private List<PagoEntity> pagos;

}
