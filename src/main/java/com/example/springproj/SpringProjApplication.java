package com.example.springproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProjApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringProjApplication.class, args);

        Alien alien = context.getBean(Alien.class);
        alien.show();

        Alien alien1 = context.getBean(Alien.class);
        alien1.show();
    }
}
