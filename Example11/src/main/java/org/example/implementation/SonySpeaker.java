package org.example.implementation;

import org.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {
    public String makeSound(){
        return "Playing music with sony speakers";
    }
}
