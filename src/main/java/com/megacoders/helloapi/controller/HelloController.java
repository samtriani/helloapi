package com.megacoders.helloapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of("message", "Hi SAM from Spring Boot API on OpenShift!");
    }
    
    @GetMapping("/master")
    public Map<String, String> sayMaster() {
        return Map.of("message", "Hi Master SAM!");
    }
}
