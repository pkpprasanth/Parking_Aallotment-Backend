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

import com.parking.dao.SlotRepository;
import com.parking.model.Slot;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/slot")
public class SlotConttoller {

	@Autowired
	private SlotRepository slotRepository;

	@GetMapping("/")
	public List<Slot> getAllSlot() {
		return slotRepository.findAll();
	}

	@PostMapping("/")
	public Slot addSlot(@Valid @RequestBody Slot slot) {
		return slotRepository.save(slot);
	}
}
