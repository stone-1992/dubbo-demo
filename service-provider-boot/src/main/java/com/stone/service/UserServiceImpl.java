package com.stone.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.stone.service.UserService;

@Service // dubbo的，不是spring的
public class UserServiceImpl implements UserService{
	public String getUser(String userId) {
		if("1".equals(userId)) {
			return "用户1 -- Boot方式";
		}else if("2".equals(userId)) {
			return "用户2 -- Boot方式";
		}
		return "请输入id获取用户";
	}
}


