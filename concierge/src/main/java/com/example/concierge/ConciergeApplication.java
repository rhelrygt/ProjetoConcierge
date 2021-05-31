package com.example.concierge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ConciergeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConciergeApplication.class, args);
	}

}
