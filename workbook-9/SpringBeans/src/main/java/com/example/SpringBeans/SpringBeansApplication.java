package com.example.SpringBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBeansApplication.class, args);

		//Print the bean names to console
		for (String beanName : ac.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
