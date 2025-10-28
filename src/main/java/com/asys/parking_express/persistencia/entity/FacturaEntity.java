package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "facturas")
@Getter
@Setter
@NoArgsConstructor

public class FacturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;

    private String numero_factura;
    private String fecha_emision;

    @ManyToOne
    @JoinColumn (name = "id_pago")
    private PagoEntity pago ;

}
