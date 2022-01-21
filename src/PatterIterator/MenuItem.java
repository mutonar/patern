/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatterIterator;

/**
 *
 * @author nazarov
 * Просто метод хранения списка что есть в меню каждой отдельной кухни
 */
class MenuItem {
    
   String name;
    String description;
    boolean vegetarian;
    double price;
    
    MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getDescription() {
        return description;
    }
    
}
