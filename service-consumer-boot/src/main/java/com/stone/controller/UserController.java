package com.stone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stone.service.impl.OrderServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	@RequestMapping("/getUser")
	public String getUser(String userId) {
		return "this user : " + orderServiceImpl.getUser(userId);
	}
}
