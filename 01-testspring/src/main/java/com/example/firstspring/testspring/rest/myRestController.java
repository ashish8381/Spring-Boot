package com.example.firstspring.testspring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myRestController {

    @GetMapping("/")
    public String getWelcome(){
        return "Welcome to First Sprinng Boot Project";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Good lucks";
    }

}
