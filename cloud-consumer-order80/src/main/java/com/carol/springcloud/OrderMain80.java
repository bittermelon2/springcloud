package com.carol.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

	public static void main(String[] args) {
		
		SpringApplication.run(OrderMain80.class, args);
	}

}
