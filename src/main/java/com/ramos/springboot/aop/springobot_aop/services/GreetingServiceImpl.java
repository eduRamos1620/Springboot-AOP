package com.ramos.springboot.aop.springobot_aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayHello(String person, String phrase) {
        String greeting = phrase + " " + person;
        System.out.println(greeting);
        return greeting;
    }

    @Override
    public String sayHelloError(String person, String phrase) {
        throw new RuntimeException("Algun error"); 
    }
    
}
