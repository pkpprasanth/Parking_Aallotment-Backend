package com.parking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.dao.ParkingRepository;
import com.parking.model.Parking;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/parking")
public class ParkingController {

	@Autowired
	private ParkingRepository parkingRepository;

	@GetMapping("/")
	public List<Parking> getAllUser() {
		return parkingRepository.findAll();
	}

	@PostMapping("/")
	public Parking addUser(@Valid @RequestBody Parking parking) {
		return parkingRepository.save(parking);
	}
}
