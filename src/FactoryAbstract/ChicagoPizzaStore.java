/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryAbstract;

/**
 *
 * @author nazarov
 */
class ChicagoPizzaStore extends PizzaStore {

  
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = 
            new ChicagoPizzaIngredientFactory(); // выбранная фабрика для всех пицц
 
        if (item.equals("cheese")) {
  
            pizza = new CheesePizza(ingredientFactory); // Для каждой пиццы используется выбранная фабрика
            pizza.setName("Chicago Style Cheese Pizza");
  
        } else if (item.equals("veggie")) {
 
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
 
        } else if (item.equals("clam")) {
 
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
 
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
 
        } 
        return pizza;
    }
}
