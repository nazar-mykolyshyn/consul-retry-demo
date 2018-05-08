package com.test.consulretrydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulRetryDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulRetryDemoApplication.class, args);
	}
}
