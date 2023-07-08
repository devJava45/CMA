package com.creditmanageapplicationstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {
	@GetMapping("/test")
	public String test() {
		return "Welcome to CMA";
	}

}
