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
class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Sauce and sausage";
        dough = "Thin Crust Dough"; // Тесто
        sauce = "Marinara Sauce"; // соус

        toppings.add("Double sausage"); // 
    }
    
}
