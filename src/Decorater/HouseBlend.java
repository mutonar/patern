/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorater;

/**
 *
 * @author nazarov
 * 
 * один из напитков 
 */
public class HouseBlend extends Beverage {
  
    public HouseBlend() {
        description = "Espresso";
    }
  
    public double cost() {
        return 3.459;
    }
}
