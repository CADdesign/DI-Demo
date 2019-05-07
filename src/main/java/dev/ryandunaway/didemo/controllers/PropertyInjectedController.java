package dev.ryandunaway.didemo.controllers;

import dev.ryandunaway.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * This is the WRONG WAY to do this!
 * Property injecting isn't what we want! DON'T DO IT!
 */
@Controller
public class PropertyInjectedController {

    // Concrete class name.  This isn't the interface and SHOULD be!.
    @Autowired
    public GreetingServiceImpl grettingService;

    public String sayHello() {
        return grettingService.sayGreeting();
    }
}
