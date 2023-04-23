package com.example.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("constructing: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practise drop serve today";
    }
}
