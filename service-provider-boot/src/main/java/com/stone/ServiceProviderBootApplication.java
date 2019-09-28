package com.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 1、导入依赖
 * 		1.1、导入dubbo-start
 * 		1.2、导入dubbo的其他依赖
 * 2、
 * @author stone
 *
 */
@EnableDubbo // 开启基于注解的Dubbo
@SpringBootApplication
public class ServiceProviderBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderBootApplication.class, args);
	}

}
