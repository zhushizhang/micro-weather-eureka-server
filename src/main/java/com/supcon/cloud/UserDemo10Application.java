package com.supcon.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class UserDemo10Application {

	public static void main(String[] args) {
		SpringApplication.run(UserDemo10Application.class, args);
	}
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
