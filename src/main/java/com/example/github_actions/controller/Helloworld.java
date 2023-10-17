package com.example.github_actions.controller;

import com.example.github_actions.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Helloworld {
    private final GreetingService greetingService;

    @Autowired
    public Helloworld(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    @ResponseBody
    public String greet() {
        return greetingService.greeting();
    }
}
