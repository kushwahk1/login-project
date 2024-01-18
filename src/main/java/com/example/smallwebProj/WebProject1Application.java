package com.example.smallwebProj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class WebProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebProject1Application.class, args);
	}

}
