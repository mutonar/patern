/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Linker;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author nazarov
 *
 *  CompositeIterator — НЕТРИВИАЛЬНЫЙ итератор. Он перебирает элементы 
    MenuItem в комбинации, а также следит за тем, чтобы в перебор были вклю­
    чены все дочерние меню (а также их дочерние меню, и т. д.).
 */
class CompositeIterator implements Iterator {
 
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
   
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }
   
    @Override
    public Object next() {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            
            stack.push(component.createIterator());
             
            return component;
        } else {
            return null;
        }
    }
  
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }  
}

