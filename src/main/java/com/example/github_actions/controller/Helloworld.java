package com.example.github_actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Helloworld {

    @GetMapping("/greeting")
    @ResponseBody
    public String greet() {
        return "CI CD workflows using github actions - docker - docker swarm";
    }
}
