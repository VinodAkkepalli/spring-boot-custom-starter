package com.example.client.service;

import com.example.customstarter.service.HelloService;

public class CustomHelloService implements HelloService {

	@Override
	public void sayHello() {
		System.out.println("Hello!! from CUSTOM starter");

	}

}
