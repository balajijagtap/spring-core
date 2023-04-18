package com.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 10 minutes";
    }
}
