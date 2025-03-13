package com.learn.springboot.demo.mycoolapp.rest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//
//    // Inject properties from app.ppts
//    @Value("${coach.name}")
//    private String coachName;
//
//    @Value("${team.name}")
//    private String teamName;
//
//
//    // expose new end point for team info
//
//    @GetMapping("/coach")
//    public String getTeamInfo() {
//        return "Coach: " +coachName +", Team name: " +teamName;
//    }
//
//    //expose return hello world
//
//    @GetMapping("/")
//    public String sayHello() {
//        return "Hello World";
//    }
//
//    //expose new end point for workout
//
//    @GetMapping("/workout")
//    public String getDailyWorkout() {
//        return "Run a hard 5k!";
//    }
//
//    //expose new end point for fortune
//    @GetMapping("/fortune")
//    public String getDailyFortune() {
//        return "You can do this :) i told u ";
//    }

}
