package com.example.github_actions.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greeting() {
        return "CI CD workflows using github actions - docker - docker swarm";
    }
}
