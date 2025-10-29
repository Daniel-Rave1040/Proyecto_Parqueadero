package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.CiudadEntity;
import com.asys.parking_express.persistencia.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<CiudadEntity, Long> {
}
