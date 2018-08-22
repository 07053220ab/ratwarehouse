package com.dajie.djspringboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dajie"})
public class DjSpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DjSpringbootTestApplication.class, args);
	}
}
