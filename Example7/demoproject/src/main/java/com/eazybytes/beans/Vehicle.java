package com.eazybytes.beans;

public class Vehicle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }



    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }
}