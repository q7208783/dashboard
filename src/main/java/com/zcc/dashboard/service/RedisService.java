package com.zcc.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by ZhangChicheng on 2017/10/19.
 */
@Service
public class RedisService {
	@Autowired
	private RedisTemplate redisTemplate;

	public boolean set(){

	}
}
