package com.example.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    // constructor injection
    @Autowired
    public DemoController(Coach coach){
        System.out.println("constructing: "+DemoController.class.getSimpleName());
        this.coach= coach;
    }

//    // setter injection
//    @Autowired
//    public void setCoach(@Qualifier("tennisCoach") Coach coach){
//        this.coach=coach;
//    }

    @GetMapping("/daily-workout")
    public String dailyWorkout(){
        return coach.getDailyWorkout();
    }

}
