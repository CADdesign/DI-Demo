package dev.ryandunaway.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I'm from the ConstructorGreetingService";
    }
}
