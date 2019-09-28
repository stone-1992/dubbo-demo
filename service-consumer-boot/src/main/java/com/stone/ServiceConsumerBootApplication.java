package com.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class ServiceConsumerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerBootApplication.class, args);
	}

}
