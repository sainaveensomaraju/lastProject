package com.example.pathology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PathologyServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathologyServiceMsApplication.class, args);
	}

}
