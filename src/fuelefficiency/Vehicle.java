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
public abstract class Vehicle {
    /*getDistance will be overwritten by each of it's subclasses, where they
    will each be used to find the amount of distance the class's respective
    vehicle can travel based on the given fuel*/
    public abstract void getDistance(double litreally);
}
