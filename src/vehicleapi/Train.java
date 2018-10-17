/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi;

import vehicleapi.interfaces.Boardable;

/**
 *
 * @author ty.meutz
 */
public class Train extends Vehicle implements Boardable {
    int numberOfWheels;
    int numberOfCarts;
    int weight;
    int maxPassengers;
    
    Train(){
        
    }
    Train(int ms, int year, String ftype, String make, String model, int numberOfWheels, int numberOfCarts, int weight){
        super(ms,year,ftype,make,model);
        this.numberOfWheels = numberOfWheels;
        this.numberOfCarts = numberOfCarts;
        this.weight = weight;
        
    }
    public int getMaxPassengers(){
        return maxPassengers;
    }

    @Override
    public boolean isOverSold() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
