package com.example.springcore;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
        @Override
        public String getDailyWorkout() {
            return "practise drop serve today";
        }
}
