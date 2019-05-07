package dev.ryandunaway.didemo.services.primaryServices;

import dev.ryandunaway.didemo.services.GreetingRepository;
import dev.ryandunaway.didemo.services.GreetingService;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "de":
                return new PrimaryGermanGreetingService(this.greetingRepository);
            case "es":
                return new PrimarySpanishGreetingSvc(this.greetingRepository);

                default:
                return new PrimaryGreetingService(this.greetingRepository);
        }

    }


}
