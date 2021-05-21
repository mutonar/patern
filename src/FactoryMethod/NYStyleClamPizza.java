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
class NYStyleClamPizza extends Pizza { // Clam - молюск

    public NYStyleClamPizza() {
        name = "NY Style Sauce and sea clam";
        dough = "Thin Crust Dough"; // Тесто
        sauce = "Marinara Sauce";

        toppings.add("sea fish"); // 
    }
    
}
