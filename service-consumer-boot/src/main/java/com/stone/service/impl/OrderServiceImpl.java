package com.stone.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stone.service.OrderServer;
import com.stone.service.UserService;

@Component
public class OrderServiceImpl implements OrderServer{
	
	@Reference
	UserService userService;
	
	public String getUser(String userId) {
		String user = userService.getUser(userId);
		return user;
	}
}
