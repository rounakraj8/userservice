package com.userservice.user.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.user.service.AuthenticationService;

@RestController
@RequestMapping("/")
public class AuthenticationController {

	@Autowired
	private AuthenticationService service;

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/pdf")
	public void authenticateUser(@RequestBody Map<String, String> user, HttpServletResponse response)
			throws UnsupportedEncodingException, AuthenticationException {
		String userName = user.get("username");
		String password = user.get("password");
		String token = service.authenticateUser(userName.toLowerCase().trim(), password, response);
		response.addHeader("Token", token);
	}

}