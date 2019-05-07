package dev.ryandunaway.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Profile is a way to separate areas, like a

//@Service
//@Profile("es")
//@Primary
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Servicio de saludo primario dice hola";
    }
}
