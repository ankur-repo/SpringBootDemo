package com.fis.ankur.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fis.ankur.demo.pojoobject.ServerInfo;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ServerInfo obj = new ServerInfo();
		System.out.println("#############"+obj.getPort());
	}

}
