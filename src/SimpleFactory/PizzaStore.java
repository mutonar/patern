/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SimpleFactory;

/**
 *
 * @author nazarov
 */
public class PizzaStore {
    SimplePizzaFactory factory; // Фабрика передается магазину
 
    public PizzaStore(SimplePizzaFactory factory) { 
        this.factory = factory;
    }
 
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}