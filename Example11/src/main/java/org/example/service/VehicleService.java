package org.example.service;

import org.example.interfaces.Speaker;
import org.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    @Autowired
    private Speaker speaker;
    @Autowired
    private Tyre tyre;

    public void playMusic(){
        String music = speaker.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String move = tyre.rotate();
        System.out.println(move);
    }

    public Speaker getSpeaker(){
        return speaker;
    }

    public void setSpeaker(Speaker speaker){
        this.speaker = speaker;
    }

    public Tyre getTyre(){
        return tyre;
    }

    public void setTyre(Tyre tyre){
        this.tyre = tyre;
    }
}
