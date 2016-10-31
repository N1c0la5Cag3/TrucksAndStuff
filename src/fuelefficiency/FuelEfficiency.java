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
        System.out.println("How many litres can I see?\nHow many litres are around me?");
        Scanner sc = new Scanner(System.in);
        String litres = sc.nextLine();
        
        double litresICanSee = Double.parseDouble(litres);
        
        Vehicle Potato = new Truck();
    }
    
}
