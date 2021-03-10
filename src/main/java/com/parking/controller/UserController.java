package com.parking.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.dao.UserRepository;
import com.parking.error.ResourceNotFoundException;
import com.parking.model.User;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/")
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable(value = "id") String userId) throws ResourceNotFoundException {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User Id not found -> " + userId));
		return user;
	}

	@PostMapping("/login")
	public boolean getUserById(@RequestBody User user) throws ResourceNotFoundException {
		User user1 = userRepository.findById(user.getEmail())
				.orElseThrow(() -> new ResourceNotFoundException("User email not found "));
		if (user1.getPassword().equals(user.getPassword())) {
			return true;
		}
		return false;
	}

	@PostMapping("/")
	public User addUser(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}

}
