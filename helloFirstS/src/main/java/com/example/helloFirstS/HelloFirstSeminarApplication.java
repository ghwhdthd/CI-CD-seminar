package com.example.helloFirstS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HelloFirstSeminarApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloFirstSeminarApplication.class, args);
	}

}
