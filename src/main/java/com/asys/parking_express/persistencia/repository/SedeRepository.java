package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.SedeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SedeRepository extends JpaRepository<SedeEntity, Long> {
}
