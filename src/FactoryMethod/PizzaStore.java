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
     Паттерн Фабричный Метод определяет интерфейс создания 
     объекта,  но  позволяет  субклассам  выбрать  класс  создаваемо-
     го экземпляра. Таким образом, Фабричный Метод делегирует 
     операцию создания экземпляра субклассам.
     */

    // Другие методы
}
