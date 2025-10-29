package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.ClienteEntity;
import com.asys.parking_express.persistencia.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
