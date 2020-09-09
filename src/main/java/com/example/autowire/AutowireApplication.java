package com.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowireApplication {
	@Autowired
	static FooService foo1;

	public static void main(String[] args) {
		SpringApplication.run(AutowireApplication.class, args);
	}
}