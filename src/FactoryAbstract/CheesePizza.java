/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryAbstract;

/**
 *
 * @author nazarov
 * 
 * переработанная пицца
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
 
    public CheesePizza(PizzaIngredientFactory ingredientFactory) { // для каждой пиццы своя фабрика ингридиентов
        this.ingredientFactory = ingredientFactory;
    }
 
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();    // делаем тесто 
        sauce = ingredientFactory.createSauce();    // Соус
        cheese = ingredientFactory.createCheese();  // Сыр
    }
}