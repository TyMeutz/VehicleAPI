/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi.interfaces;

/**
 *
 * @author ty.meutz
 */
public interface Steerable {
    
    
    public boolean alterHeading(double degrees);
    
    
    
    public boolean resetSteering();
}
