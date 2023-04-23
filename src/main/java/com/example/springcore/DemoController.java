package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anotherCoach;

    // constructor injection
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach anotherCoach) {
        System.out.println("constructing: " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

//    // setter injection
//    @Autowired
//    public void setCoach(@Qualifier("tennisCoach") Coach coach){
//        this.coach=coach;
//    }

    @GetMapping("/daily-workout")
    public String dailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/scope")
    public String checkBeanScope() {
        return "coach == anotherCoach, " + (coach == anotherCoach);
    }

}
