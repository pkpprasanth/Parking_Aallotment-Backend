package com.parking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, String> {

}
