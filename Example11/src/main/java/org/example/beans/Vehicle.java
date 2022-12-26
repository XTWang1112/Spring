package org.example.beans;

import org.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
public class Vehicle {
    private String brand = "Honda";
    private final VehicleService vehicleService;

    @Autowired
    public Vehicle(VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }


    public VehicleService getVehicleService(){
        return vehicleService;
    }
}
