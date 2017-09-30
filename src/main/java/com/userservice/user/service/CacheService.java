package com.userservice.user.service;

public interface CacheService {

	public void pushData(String key, String value);

	public String getData(String key);

}
