package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Long> {
}
