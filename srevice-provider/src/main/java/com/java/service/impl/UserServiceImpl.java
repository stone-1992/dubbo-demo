package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.stone.service.UserService;

/**
 * @Service Dubboע�⣬��¶���񣬲�Ҫ��xml����
 * @author stone
 *
 */
@Service
public class UserServiceImpl implements UserService{
	public String getUser(String userId) {
		if("1".equals(userId)) {
			return "�û�1";
		}else if("2".equals(userId)) {
			return "�û�2";
		}
		return "�û���";
	}
}


