package com.eazybytes.main;

import com.eazybytes.beans.Vehicle;
import com.eazybytes.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3{
    public static void main(String[] arg){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean("AudiVehicle", Vehicle.class);
        Vehicle vehicle2 = context.getBean("HondaVehicle", Vehicle.class);
        Vehicle vehicle3 = context.getBean("FerrariVehicle", Vehicle.class);

        System.out.println(vehicle1.getName());
        System.out.println(vehicle2.getName());
        System.out.println(vehicle3.getName());


    }
}
