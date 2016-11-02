/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

import java.util.Scanner;

/**
 *
 * @author luoos2514
 */
public class FuelEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prompts user for amount of fuel (in litres)
        System.out.println("How many litres can I see?\nHow many litres are around me?");
        Scanner sc = new Scanner(System.in);
        String litres = sc.nextLine();
        
        //Stores the user's given value
        double litresICanSee = Double.parseDouble(litres);
        
        //Creates an object for each of the 4 vehicle options
        Vehicle truck = new Truck();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle hybrid = new HybridCar();
        
        System.out.println("\nGiven " + litresICanSee + " litres of gas, the"
                + " vehicles can each travel this far: \n"
                + "**********************************************************");
        
        /*Gets and prints the values for the distance (km) each vehicle can
        travel, given the specified number of litres of fuel*/
        truck.getDistance(litresICanSee);
        car.getDistance(litresICanSee);
        motorcycle.getDistance(litresICanSee);
        hybrid.getDistance(litresICanSee);     
        
    }
}
