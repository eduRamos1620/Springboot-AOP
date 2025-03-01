package com.ramos.springboot.aop.springobot_aop.controllers;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramos.springboot.aop.springobot_aop.services.GreetingService;

@RestController
public class GreetingController {
    
    @Autowired
    private GreetingService greeting;

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting(){
        return ResponseEntity.ok(Collections.singletonMap("greeting", greeting.sayHello("Isdh", "Vuelve")));
    }
}
