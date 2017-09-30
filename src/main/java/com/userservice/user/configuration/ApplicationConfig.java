package com.userservice.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;

@Configuration
public class ApplicationConfig {

	@Bean
	public JedisPool getJedisPool() {

		return new JedisPool();
	}

}