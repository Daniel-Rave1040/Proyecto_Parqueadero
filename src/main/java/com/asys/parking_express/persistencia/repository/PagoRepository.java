package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<PagoEntity, Long> {
}
