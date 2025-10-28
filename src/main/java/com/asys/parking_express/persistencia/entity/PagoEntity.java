package com.asys.parking_express.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pagos")
@Getter
@Setter
@NoArgsConstructor

public class PagoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pago;

    private String monto;
    private String fecha_pago;

    @OneToOne
    @JoinColumn(name = "id_reserva")
    private ReservaEntity reserva;

    @ManyToOne
    @JoinColumn (name = "id_tipo_pago")
    private TiposPagosEntity tiposPagos ;

    @OneToMany(mappedBy = "pago")
    private List<FacturaEntity> factura;




}
