package com.example.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FreedaAdminserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreedaAdminserviceApplication.class, args);
	}

}
