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
class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Sea Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Add sea fish");
        toppings.add("Add sea scallop");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
