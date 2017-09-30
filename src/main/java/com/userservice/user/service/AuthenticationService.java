package com.userservice.user.service;

import java.io.UnsupportedEncodingException;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletResponse;

public interface AuthenticationService {

	String authenticateUser(String userName, String password, HttpServletResponse response)
			throws UnsupportedEncodingException, AuthenticationException;

}