package com.example.workshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkshopApplication {

    @Value( "${message}" )
    private String message;

    @RequestMapping("/")
    public String home() {
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(WorkshopApplication.class, args);
    }

}
