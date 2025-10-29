package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<VehiculoEntity, Long> {
}
