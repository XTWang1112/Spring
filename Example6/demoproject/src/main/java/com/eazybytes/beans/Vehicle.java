package com.eazybytes.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }


    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }
}
