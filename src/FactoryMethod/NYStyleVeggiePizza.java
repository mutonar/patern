/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author nazarov
 */
class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and vegetables";
        dough = "Thin Crust Dough"; // Тесто
        sauce = "Marinara Sauce";

        toppings.add("Olive oil"); // 
        toppings.add("Cotton oil"); //  хлопковое
    }
}
