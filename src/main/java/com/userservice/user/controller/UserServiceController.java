package com.userservice.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserServiceController {

	private static final String STATUS = "UserService IS UP!";

	@RequestMapping(value="/status")
	public String healthCheck() {
		return STATUS;
	}

}