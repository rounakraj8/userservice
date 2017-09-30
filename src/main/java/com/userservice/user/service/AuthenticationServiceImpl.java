package com.userservice.user.service;

import java.io.UnsupportedEncodingException;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authService")
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private CacheService cacheService;

	private final static String LOGIN_SUCCESSFUL = "LOGIN_SUCCESS";

	private final static String LOGIN_FAIL = "LOGIN_FAIL";

	@Override
	public String authenticateUser(String userName, String password, HttpServletResponse response)
			throws UnsupportedEncodingException, AuthenticationException {

		String passwordFromCache = cacheService.getData(userName);

		return passwordFromCache != null && passwordFromCache.equals(password) ? LOGIN_SUCCESSFUL : LOGIN_FAIL;
	}

}
