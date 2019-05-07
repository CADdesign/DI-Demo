package dev.ryandunaway.didemo.services.primaryServices;

import dev.ryandunaway.didemo.services.GreetingRepository;
import dev.ryandunaway.didemo.services.GreetingService;

public class PrimarySpanishGreetingSvc implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingSvc(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getSpanishGreeting();
    }
}
