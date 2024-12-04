package com.example.SpringBeans;

import com.example.SpringBeans.GreetingService;
import com.example.SpringBeans.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {
    GreetingService greetingService;
    MessageService messageService;

    public BeanController(GreetingService greetingService, MessageService messageService) {
        this.greetingService = greetingService;
        this.messageService = messageService;
    }

    //endpoint to get Greeting's message
    @GetMapping("/greeting")
    public String getGreeting() {
        return greetingService.getGreeting();
    }

    //endpoint to get Message's message
    @GetMapping("/message")
    public String getMessage() {
        return messageService.getMessage();
    }
}
