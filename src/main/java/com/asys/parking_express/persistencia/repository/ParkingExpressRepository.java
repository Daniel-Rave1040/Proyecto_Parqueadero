package com.asys.parking_express.persistencia.repository;

import com.asys.parking_express.persistencia.entity.ParkingExpressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingExpressRepository extends JpaRepository<ParkingExpressEntity, Long> {
}
