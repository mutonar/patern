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
public class Whip extends CondimentDecorator {
    Beverage beverage; // переменная для хранения ссылки
 
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
 
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
 
    public double cost() {
         double cost = beverage.cost();
        if (beverage.getSize() == Size.SMALL) {
            cost += .14;
        } else if (beverage.getSize() == Size.MIDLE) {
            cost += .18;
        } else if (beverage.getSize() == Size.GRAND) {
            cost += .22;
        }
        return cost;

    }
}
