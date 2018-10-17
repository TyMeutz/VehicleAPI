/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleapi;

/**
 *
 * @author ty.meutz
 */
public class VehicleAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Train train1 = new Train(80, 1998, "Coal", "Alstom", "AGV", 72, 20, 100000);
        Car car1 = new Car(4, 120, 2007, "Gasoline", "Kia", "Spectra");
        Car car2 = new Car(4, 120, 1998, "Gasoline", "Alstom", "AGV");
        Train train2 = new Train(80, 1998, "Coal", "Alstom", "AGV", 72, 20, 100000);

        System.out.println("This is train 1: " + train1.toString());
        System.out.println("This is car 1: " + car1.toString());

        System.out.println("Equals? " + train2.equals(train1));

    }

}
