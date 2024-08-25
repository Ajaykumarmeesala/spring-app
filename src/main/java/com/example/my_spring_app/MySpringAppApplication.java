package com.example.my_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MySpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringAppApplication.class, args);
    }
    
    @RestController
    class HelloController {
        @GetMapping("/")
        public String hello() {
            return "Hello, World!";
        }
    } // Closing brace for HelloController class
} // Closing brace for MySpringAppApplication class
