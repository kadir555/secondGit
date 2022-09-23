package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecondgitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondgitApplication.class, args);
	}


	@GetMapping("/home")
	public String home()
	{
		return "this is my second git";

	}

}


