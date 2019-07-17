package com.ea.ecommercereviewservicebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ECommerceReviewServiceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceReviewServiceBackendApplication.class, args);
	}

}
