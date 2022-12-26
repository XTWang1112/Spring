package com.eazybytes.main;

import com.eazybytes.beans.Person;
import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class
Example8 {
    public static void main(String[] arg){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println("Person name: " + person.getName());
        System.out.println("Vehicle name: " + vehicle.getName());
        System.out.println(person.getName() + "'s vehicle: " + person.getVehicle());
    }
}
