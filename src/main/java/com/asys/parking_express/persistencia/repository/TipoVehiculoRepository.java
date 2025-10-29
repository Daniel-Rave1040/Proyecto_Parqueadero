package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.TipoVehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculoEntity, Long> {
}
