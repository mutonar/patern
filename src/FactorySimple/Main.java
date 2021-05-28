/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactorySimple;

/**
 *
 * @author nazarov
 * 
 * Тут описывается простая фабрика
 * 
 */
public class Main {
    public static void main(String[] args){
        PizzaStore store = new PizzaStore(new SimplePizzaFactory()); // в новый магазин вставляем фабрику
        Pizza p1 = store.orderPizza("cheese"); // фабрика все сама сделает а метод вернет готовую пицу
        Pizza p2 = store.orderPizza("veggie");
    }
}
