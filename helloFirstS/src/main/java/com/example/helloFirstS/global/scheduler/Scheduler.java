package com.example.helloFirstS.global.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Scheduled(cron = "*/1 * * * * *")
    private void sayHello(){
        System.out.println("Welcome to first seminar!!");
    }
}
