package com.cts.project.epharma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootApplication
@RestController
public class SbRestApplication {	
	public static void main(String[] args) {
		SpringApplication.run(SbRestApplication.class, args);
	}
	
	@GetMapping("/ab/{name}")
	public String hello(@PathVariable("name") String name)
	{
		return "Hello Jenkins......."+name;
	}
	
}
