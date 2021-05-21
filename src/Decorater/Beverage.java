/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorater;

/**
 *
 * @author nazarov
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    public enum Size { SMALL, MIDLE, GRAND };
    Size size = Size.SMALL; // default size cup coffe
  
    public String getDescription() { // Implementation in whis already
        return description;
    }
 
    public abstract double cost(); // Need Implementation in sub class
    
    public void setSize(Size size) {
        this.size = size;
    }
    
    public Size getSize() {
        return this.size;
    }
}
