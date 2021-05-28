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
class PepperoniPizza extends Pizza {
 
    PizzaIngredientFactory ingredientFactory;
 
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) { // для каждой пиццы своя фабрика ингридиентов
        this.ingredientFactory = ingredientFactory;
    }
 
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();    // делаем тесто 
        sauce = ingredientFactory.createSauce();    // Соус
        pepperoni = ingredientFactory.createPepperoni();  // добавляем пеперони
    }
    
}
