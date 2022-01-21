/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatterIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author nazarov
 */
class PancakeHouseMenu implements Menu{
    
     ArrayList<MenuItem> menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B’s Pancake Breakfast", 
            "Pancakes with scrambled eggs, and toast", 
            true,
            2.99);
 
        addItem("Regular Pancake Breakfast", 
            "Pancakes with fried eggs, sausage", 
            false,
            2.99);
 
        addItem("Blueberry Pancakes",
            "Pancakes made with fresh blueberries",
            true,
            3.49);
 
        addItem("Waffles",
            "Waffles, with your choice of blueberries or strawberries",
            true,
            3.59);
    }
    
    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
 
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    
    @Override
    public Iterator<MenuItem> getIterator() { // Вот тут главная хитрость вызова итератора самого меню
        return menuItems.iterator();
    }

}
