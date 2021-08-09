package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.controller.DemoController;

//@SpringBootApplication
//@Configuration
@ComponentScan
@EnableAutoConfiguration
public class WebOnlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebOnlyApplication.class, args);
		
	}

}
