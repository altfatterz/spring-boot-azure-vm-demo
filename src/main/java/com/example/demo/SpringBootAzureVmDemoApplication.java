package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureVmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureVmDemoApplication.class, args);
    }

    @GetMapping
    public String great() {
        return "Hello";
    }

}
