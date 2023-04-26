package com.example.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication

public class FreedaUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreedaUserserviceApplication.class, args);
	}

}
