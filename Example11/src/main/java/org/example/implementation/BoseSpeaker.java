package org.example.implementation;

import org.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker {
    public String makeSound(){
        return "Playing music with bose speakers";
    }
}
