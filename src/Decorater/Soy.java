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
public class Soy extends CondimentDecorator {
    Beverage beverage; // переменная для хранения ссылки
 
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
 
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
 
    public double cost() {
         double cost = beverage.cost();
        if (beverage.getSize() == Size.SMALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.MIDLE) {
            cost += .15;
        } else if (beverage.getSize() == Size.GRAND) {
            cost += .20;
        }
        return cost;

    }
}
