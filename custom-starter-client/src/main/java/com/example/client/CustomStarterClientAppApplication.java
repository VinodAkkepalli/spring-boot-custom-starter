package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.client.service.CustomHelloService;
import com.example.customstarter.service.HelloService;

@SpringBootApplication
public class CustomStarterClientAppApplication implements CommandLineRunner{

	@Autowired
	HelloService helloService;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomStarterClientAppApplication.class, args);
	}
	
	@Bean
	public HelloService getHelloService() {
		return new CustomHelloService();
	}

	@Override
	public void run(String... args) throws Exception {
		helloService.sayHello();		
	}

}
