package com.parcking.allotment.main;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.parking.controller.SlotConttoller;
import com.parking.controller.UserController;
import com.parking.dao.SlotRepository;
import com.parking.dao.UserRepository;
import com.parking.model.Slot;
import com.parking.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ParkingAllotmentApplicationTests.class)

class ParkingAllotmentApplicationTests {

	@Autowired
	private UserController userController;

	@Autowired
	private SlotConttoller slotConttoller;

	@MockBean
	private UserRepository repository;
	@MockBean
	private SlotRepository slotRepository;

	@Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User(1, "prasanth", "P", "prasanth@gmail.com", "123456789", 1, "98765434"),
						new User(1, "abc", "a", "abc@gmail.com", "123456789", 1, "98765434"))
				.collect(Collectors.toList()));
		assertEquals(1, userController.getAllUser().size());
	}

	@Test
	public void saveUserTest() {
		User user = new User(1, "prasanth", "P", "prasanth@gmail.com", "123456789", 1, "98765434");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, userController.addUser(user));
	}

	@Test
	public void getslotTest() {
		when(slotRepository.findAll())
				.thenReturn(Stream
						.of(new Slot("prasanth@gmail.com", "prasanth@gmail.com", "123456789", 23),
								new Slot("abc@gmail.com", "abc@gmail.com", "123456789", 21))
						.collect(Collectors.toList()));
		assertEquals(2, slotConttoller.getAllSlot().size());
	}

	@Test
	public void savesoltTest() {
		Slot slot = new Slot("prasanth@gmail.com", "abc@gmail.com", "98765434", 22);
		when(slotRepository.save(slot)).thenReturn(slot);
		assertEquals(slot, slotConttoller.addSlot(slot));
	}

}
