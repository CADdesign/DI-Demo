package dev.ryandunaway.didemo.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepoImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service from GreetingRepoImpl";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de saludo primario dice hola from GreetingRepoImpl";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer Grudienst from GreetingRepoImpl";
    }
}
