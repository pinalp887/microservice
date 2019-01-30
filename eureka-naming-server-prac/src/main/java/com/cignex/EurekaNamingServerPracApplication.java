package com.cignex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerPracApplication.class, args);
	}

}

