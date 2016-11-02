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
public class Motorcycle extends Vehicle{
    
    /*Finds how far the Stingray can travel based on the given fuel
    PRE: A double must be passed as an argument
    POST: The Stingray's distance travelled will be printed out
    */
    public void getDistance(double litreally) {
        double kilometrage = (100/6.3)*litreally;
        System.out.println("Stingray: " + kilometrage + " km");
    }
}
