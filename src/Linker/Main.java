/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Linker;

/**
 *
 * @author nazarov
 * 
 * тут описывается Компоновщик
 * связанные с меню и патерном иттератор
 */
public class Main {
       public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = 
            new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = 
            new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = 
            new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = 
            new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
  
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
  
        // добавление содержание меню
        dinerMenu.add(new MenuItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true, 
            3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla icecream",
            true,
            1.59));
  
        // передаем меню официантке
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
