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
class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Double tomato."); // Shredded - Измельченный
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
