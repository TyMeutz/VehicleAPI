/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi.interfaces;

/**
 *
 * @author christopher.eckles
 */
public interface Brakeable {
    boolean brakeEngaged();
    boolean applyBreak(int deg);
    boolean applyEmergencyBreak();
    
}
