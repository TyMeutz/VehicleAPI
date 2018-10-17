/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi;

import java.util.Objects;
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
    String make = "";
    String model = "";
    
    
    Vehicle(){
        
    }
    
    Vehicle(int ms, int year, String ftype, String make, String model){
        this.maxSpeed = ms;
        this.yearOfOrigin = year;
        this.fuelType = ftype;
        this.make = make;
        this.model = model;
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.yearOfOrigin;
        hash = 23 * hash + Objects.hashCode(this.make);
        hash = 23 * hash + Objects.hashCode(this.model);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (this.yearOfOrigin != other.yearOfOrigin) {
            return false;
        }
        if (!Objects.equals(this.make, other.make)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        return true;
    }
    @Override 
    public String toString(){
        return yearOfOrigin + " " + make + " " + model ;  
    }
}
