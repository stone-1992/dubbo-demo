package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stone.service.UserService;

/**
 * @Service Dubbo注解，暴露服务，不要再xml配置
 * @author stone
 *
 */
@Service
public class UserServiceImpl implements UserService{
	public String getUser(String userId) {
		if("1".equals(userId)) {
			return "用户1";
		}else if("2".equals(userId)) {
			return "用户2";
		}
		return "用户无";
	}
}


