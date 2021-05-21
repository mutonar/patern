/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorater;

/**
 *
 * @author nazarov
 * 
 * Реализация патерна Декоратор
 *  Заворачиваем одни объект в другие и наделяем их новыми фукциями
 * 
 */
public class Main {
    
    public static void main(String[] args){
        Beverage beverage = new Espresso(); // without addition
        System.out.println(beverage.getDescription() 
                + " $" + beverage.cost());
 
        Beverage beverage2 = new DarkRoast();// without addition
        beverage2 = new Mocha(beverage2);   // add addition
        beverage2 = new Mocha(beverage2);   // add double addition
        beverage2 = new Whip(beverage2);    // add addition Whip
        System.out.println(beverage2.getDescription() 
                + " $" + beverage2.cost());
 
        // Blending coffe how over
        Beverage beverage3 = new HouseBlend(); 
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() 
                + " $" + beverage3.cost());
    }
}
