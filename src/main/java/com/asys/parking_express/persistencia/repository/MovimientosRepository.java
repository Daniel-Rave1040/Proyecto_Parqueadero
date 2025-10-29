package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.MovimientosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientosRepository extends JpaRepository<MovimientosEntity, Long> {
}
