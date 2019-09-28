package com.java.service;

import java.io.IOException;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.java.**"})
public class ServiceProviderApplication {
	public static void main(String[] args) throws IOException {
//		SpringApplication.run(ServiceProviderApplication.class, args);
		
		getName();
	}
	public static void getName() {
		String[] files = {"ÞÈ","º­","¾ù","ÔÏ","·á","·å","Ðñ","¾°","ê»","ÖÂ","¼Î","¼Ñ"
				,"Ï£","ÓÓ","²©","Óî","Ñô","ç÷","Ë¼","ÑÔ","ÜÆ","Ðù","¾¸","ÕÜ"};
		
		/**
		 * Ê¯ÜÆá°
		 * Ê¯ÜÆº­
		 * Ê¯Çååû
		 * Ê¯ÐÄåû
		 * Ê¯Ã÷Óî
		 * Ê¯ÐñÐù
		 */
		
		System.err.println(files.length);
		
		Random random = new Random();
		
		for(int i = 0;i<files.length * files.length ;i++) {
			int x = random.nextInt(files.length);
			int y = random.nextInt(files.length);
			System.out.println("Ê¯"+files[x]+files[y]);
		}
		
	}
}


