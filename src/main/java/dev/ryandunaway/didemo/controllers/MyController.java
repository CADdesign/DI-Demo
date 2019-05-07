package dev.ryandunaway.didemo.controllers;

import dev.ryandunaway.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

// This is WILD!  The Primary bean annotation overrides EVERYTHING! It is awesome!

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {

        return this.greetingService.sayGreeting();
    }
}
