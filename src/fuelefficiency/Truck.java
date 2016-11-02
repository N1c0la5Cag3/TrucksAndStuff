/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fuelefficiency;

/**
 *
 * @author luoos2514
 */
public class Truck extends Vehicle {
    
    /*Finds how far The Bat Truck can travel based on the given fuel
    PRE: A double must be passed as an argument
    POST: The Bat Truck's distance travelled will be printed out
    */
    public void getDistance(double litreally) {
        double kilometrage = (100/14.1)*litreally;
        System.out.println("The Bat Truck: " + kilometrage + " km");
    }
}
