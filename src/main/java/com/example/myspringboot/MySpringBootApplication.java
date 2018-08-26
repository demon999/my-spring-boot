package com.example.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.myspringboot")
public class MySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
