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
 * 
 * просто заглушка для итераторов
 */
class NullIterator implements Iterator<MenuComponent> {

    public NullIterator() {
    }

    @Override
    public boolean hasNext() {
         return false;
    }

    @Override
    public MenuComponent next() {
         return null;
    }
    
}
