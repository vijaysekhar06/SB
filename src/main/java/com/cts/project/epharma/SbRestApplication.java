package com.cts.project.epharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbRestApplication.class, args);
	}
	
	@GetMapping("/")
	public String hello()
	{
		return "Hello Jenkins";
	}
	
}
