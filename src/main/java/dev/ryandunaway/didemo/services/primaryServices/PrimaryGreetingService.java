package dev.ryandunaway.didemo.services.primaryServices;

import dev.ryandunaway.didemo.services.GreetingRepository;
import dev.ryandunaway.didemo.services.GreetingService;

// This Primary does this is making it first which is awesome!.

//@Service
//@Profile({"en", "default"})
//@Primary
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.greetingRepository.getEnglishGreeting();
    }
}
