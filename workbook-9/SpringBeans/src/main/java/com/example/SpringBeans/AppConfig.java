package com.example.SpringBeans;

import com.example.SpringBeans.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new MessageService(); //Create and return an instance of the MessageService
    }
}
