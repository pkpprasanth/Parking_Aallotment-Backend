package com.parking.allotment.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.parking.controller" })
@EntityScan({ "com.parking.model" })
@EnableJpaRepositories({ "com.parking.dao" })
public class ParkingAllotmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingAllotmentApplication.class, args);
	}

}
