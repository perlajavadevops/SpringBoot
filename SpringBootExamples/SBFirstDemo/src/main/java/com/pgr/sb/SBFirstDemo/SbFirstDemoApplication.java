package com.pgr.sb.SBFirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbFirstDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello First Spring Boot application");
		SpringApplication.run(SbFirstDemoApplication.class, args);
	}

}
