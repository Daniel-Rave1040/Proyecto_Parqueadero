package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
}
