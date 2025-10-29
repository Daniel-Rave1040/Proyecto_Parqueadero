package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {
}
