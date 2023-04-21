package com.example.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("constructing: "+CricketCoach.class.getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 10 minutes";
    }
}
