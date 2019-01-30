package com.cignex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;
@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulApiGatewayServerPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayServerPracApplication.class, args);
	}
	
	@Bean
	public Sampler getSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}

