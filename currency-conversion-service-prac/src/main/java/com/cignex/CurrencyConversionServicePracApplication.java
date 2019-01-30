package com.cignex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.cignex")
@EnableDiscoveryClient
public class CurrencyConversionServicePracApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServicePracApplication.class, args);
	}
	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE; 
	}
}

