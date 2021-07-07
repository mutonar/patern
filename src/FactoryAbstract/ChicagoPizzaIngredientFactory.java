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
class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    // Для каждого ингридиента создается своя версия(Отличие от ньюЁрской малюсками)
    public Dough createDough() {
        return new ThinCrustDough();
    }
 
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
 
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
 
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
 
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return new FreezeClams(); // Разные молюски в реализации мороженные
    }
}
