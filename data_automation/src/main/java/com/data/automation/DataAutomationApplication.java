package com.data.automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataAutomationApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/data-automation");
		System.setProperty("spring.banner.location", "classpath:src/main/resources/banner.txt");
		SpringApplication.run(DataAutomationApplication.class, args);
	}
}
