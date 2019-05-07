package dev.ryandunaway.didemo.controllers;

import dev.ryandunaway.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


// This is better.  We are using the interface for our service and we aren't using the concrete class.
// Constructor is preferred because what if you don't set the right property?  That is how we blow-up!
// Constructor takes the argument right-off and sets any dependencies.  Similar to what Angular does with services actually!
// To make this Spring, we add the @Controller annotation
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
