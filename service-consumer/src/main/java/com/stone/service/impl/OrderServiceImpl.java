package com.stone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.stone.service.OrderServer;
import com.stone.service.UserService;

/**
 * Dubbo RPC ���ò���
 * 1���������ṩ��ע�ᵽע������
 * 	�١�����Dubbo����(2.6.2)
 * 	�ڡ����÷����ṩ��
 * 2���÷���������ȥע�����Ķ��ķ����ṩ�ߵķ����ַ
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
