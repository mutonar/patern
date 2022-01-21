/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PatterIterator;

import java.util.Iterator;

/**
 *
 * @author nazarov
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
 
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
 
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.getIterator();
        Iterator dinerIterator = dinerMenu.getIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        getListMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        getListMenu(dinerIterator);
    }
 
    private void getListMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
 
  