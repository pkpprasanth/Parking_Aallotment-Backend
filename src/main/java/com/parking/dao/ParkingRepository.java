package com.parking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {

}
