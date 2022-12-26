package org.example.main;

import org.example.beans.Person;
import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();
        System.out.println(persons);
        System.out.println(person.getName());
        System.out.println(names);
    }
}
