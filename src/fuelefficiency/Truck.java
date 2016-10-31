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

    public Truck(){
        super();
    }
    
    public double getDistance(double litreally) {
        double kilometrage = (100/14.1)*litreally;
        return kilometrage;
    }
}
