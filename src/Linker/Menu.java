/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Linker;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author nazarov
 * 
 * может содержать элементы MenuItem или другие 
Menu. Этот класс не реализует пару методов MenuComponent (getPrice() и isVegetarian()), потому что 
эти методы не имеют особого смысла для Menu.

 */
public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;
    Iterator<MenuComponent> iterator = null; // добавляем итератор

  
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
 
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
 
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
 
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
 
    public String getName() {
        return name;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        /*  если в процессе перебора мы встретим другой 
        объект меню, его метод print() начнет новый перебор, и т. д.
        */
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
    
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

}