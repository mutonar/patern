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
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
 
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
 
    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
 
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    
    @Override
     public void remove() {
         /*
           Его можно не реализовывать, не просит по крайней мере
         Этот метод не потоко защищенный, так что внимательней с удалением
         */
          if (position <= 0) {
            throw new IllegalStateException
                ("You can’t remove an item until you’ve done at least one next()");
        }
        if (items[position-1] != null) {
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }

     }
}
