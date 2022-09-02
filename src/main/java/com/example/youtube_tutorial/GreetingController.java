package com.example.youtube_tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreeting(){
        return "Hi, its me Sisi.the.se and I like LaCroix";
    }
}
