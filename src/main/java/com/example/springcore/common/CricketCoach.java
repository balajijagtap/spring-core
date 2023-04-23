package com.example.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("constructing: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("doing post construct job of " + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("doing pre destroy job of " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 10 minutes";
    }
}
