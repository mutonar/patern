/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethod;

import java.util.ArrayList;

/**
 *
 * @author nazarov
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();
 
    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }
  
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
 
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
  
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
 
    public String getName() {
        return name;
    }
}