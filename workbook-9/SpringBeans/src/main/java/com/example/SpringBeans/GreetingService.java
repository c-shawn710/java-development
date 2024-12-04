package com.example.SpringBeans;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public String getGreeting() {
        return "Greetings";
    }
}
