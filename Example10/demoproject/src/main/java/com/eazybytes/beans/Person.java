package com.eazybytes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    @Autowired(required = false)
    private Vehicle vehicle;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }
}
