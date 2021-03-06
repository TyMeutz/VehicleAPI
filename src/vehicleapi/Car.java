/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi;

import vehicleapi.interfaces.Brakeable;
import vehicleapi.interfaces.Steerable;

/**
 *
 * @author ty.meutz
 */
public class Car extends Vehicle implements Steerable, Brakeable {
    int numOfDoors = 0;
    int currentGear = 0;
    double totalMiles = 0.0;
    double steeringWheelPosition = 0.0;
    double maxWheelPosition = 90.0;
    
    Car(){
    
    }
    
    Car(int numDoors, int ms, int year, String ftype, String make, String model){
        super(ms,year,ftype,make,model);
        numOfDoors = numDoors;
        
          
    }
    @Override
    public boolean alterHeading(double degrees){
        if(0-maxWheelPosition >= steeringWheelPosition+degrees && maxWheelPosition <= steeringWheelPosition+degrees){
            steeringWheelPosition = steeringWheelPosition+degrees;
            return true;
        }
        
        return false;
    }
    
    @Override
    public boolean resetSteering(){
        steeringWheelPosition = 0.0;
        return true;
    }

    @Override
    public boolean brakeEngaged() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean applyBreak(int deg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean applyEmergencyBreak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

