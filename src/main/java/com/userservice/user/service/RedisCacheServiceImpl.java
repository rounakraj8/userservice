package com.userservice.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class RedisCacheServiceImpl implements RedisCacheService {

	@Autowired
	private JedisPool jedispool;

	@Override
	public void pushData(String key, String value) {
		try (Jedis jedis = jedispool.getResource()) {
			jedis.set(key, value);
		}

	}

	@Override
	public String getData(String key) {
		try (Jedis jedis = jedispool.getResource()) {
			return jedis.get(key); //redisTemplate.opsForValue().get(token);
		}
	}

}
