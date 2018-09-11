package com.jib.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJibApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJibApplication.class, args);
	}
	
	@GetMapping("/")
	public String up() {
		return "up";
	}
}
