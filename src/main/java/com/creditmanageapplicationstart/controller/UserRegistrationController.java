package com.creditmanageapplicationstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.creditmanageapplicationstart.modelEntity.UserRegistration;
import com.creditmanageapplicationstart.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class UserRegistrationController {
	private static final Logger log = LoggerFactory.getLogger(UserRegistrationController.class);
	private Service userservice;
	@GetMapping("/test")
	public String test() {
		return "Welcome to CMA";
	}

	@PostMapping("/registerUser")
	public String getUserDetails(UserRegistration registration) {
		String returnUser="";
		try {
			log.info("inside UserController");
			log.info("getUserDetails method");
			
			 returnUser=userservice.save(registration);
		} catch (Exception e) {
			 
			e.printStackTrace();
			log.info("getting exception = "+e.getMessage());
		}

		return returnUser;

	}

	 
}
