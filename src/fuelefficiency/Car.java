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
public class Car extends Vehicle{
    public Car(){
        super();
    }

    public double getDistance(double litreally) {
        double kilometrage = (100/9.4)*litreally;
        return kilometrage;
    }
}
