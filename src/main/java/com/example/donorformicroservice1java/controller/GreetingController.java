package com.example.donorformicroservice1java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple REST controller to demonstrate basic endpoint functionality.
 */
@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from Microservice1Java";
    }
}
