package com.example.customstarter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.customstarter.service.HelloService;
import com.example.customstarter.service.HelloServiceImpl;

@Configuration
@ConditionalOnClass(HelloService.class)	//this configuration will be loaded only when HelloService class is in classpath
public class HelloServiceAutoConfiguration {


    //conditional bean creation
    @Bean
    @ConditionalOnMissingBean	//loads only when bean is not found in classpath
    public HelloService helloService(){
        return new HelloServiceImpl();
    }
}