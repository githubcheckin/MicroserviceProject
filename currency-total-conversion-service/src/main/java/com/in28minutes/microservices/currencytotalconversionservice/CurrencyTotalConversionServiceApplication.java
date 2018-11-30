package com.in28minutes.microservices.currencytotalconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.in28minutes.microservices.currencytotalconversionservice")
@EnableDiscoveryClient
public class CurrencyTotalConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyTotalConversionServiceApplication.class, args);
	}
}
