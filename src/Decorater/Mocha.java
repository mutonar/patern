/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Decorater;

/**
 *
 * @author nazarov
 * реализация дополнений
 * 
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage; // переменная для хранения ссылки
 
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
 
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
 
    public double cost() {
        return .20 + beverage.cost(); // возращаем и стоимость 
    }
}
