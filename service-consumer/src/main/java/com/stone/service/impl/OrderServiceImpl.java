package com.stone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.stone.service.OrderServer;
import com.stone.service.UserService;

/**
 * Dubbo RPC 调用步骤
 * 1、将服务提供者注册到注册中心
 * 	①、导入Dubbo依赖(2.6.2)
 * 	②、配置服务提供者
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * @author stone
 *
 */
@Component
public class OrderServiceImpl implements OrderServer{
	
	@Autowired
	UserService userService;
	
	public String getUser(String userId) {
		String user = userService.getUser(userId);
		return user;
	}
}
