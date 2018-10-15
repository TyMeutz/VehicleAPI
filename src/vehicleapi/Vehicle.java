/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi;

import vehicleapi.interfaces.Steerable;

/**
 *
 * @author ty.meutz
 */
public class Vehicle {
    int speed = 0;
    int maxSpeed = 0;
    int yearOfOrigin = 0;
    String fuelType = "";
    
    Vehicle(){
        
    }
    
    Vehicle(int ms, int year, String ftype){
        maxSpeed = ms;
        yearOfOrigin = year;
        fuelType = ftype;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfOrigin() {
        return yearOfOrigin;
    }

    public void setYearOfOrigin(int yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
}
