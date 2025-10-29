package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.CeldaEntity;
import com.asys.parking_express.persistencia.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CeldaRepository extends JpaRepository<CeldaEntity, Long> {
}
