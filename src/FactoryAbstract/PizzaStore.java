/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryAbstract;

import FactoryMethod.*;

/**
 *
 * @author nazarov
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type); // (Это фабричный )Метод возвращается в магазин
    /*
        но тут используется абстрактная фабрика уже в фабричном методе
     */

    // Другие методы
}
