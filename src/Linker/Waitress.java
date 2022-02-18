/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Linker;

import java.util.Iterator;

/**
 *
 * @author nazarov
 */
public class Waitress {
     MenuComponent allMenus;
 
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
 
    public void printMenu() {
        allMenus.print();
    }

     public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}
        }
    }

}
 
  