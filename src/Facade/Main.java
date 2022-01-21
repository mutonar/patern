/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Facade;

/**
 *
 * @author nazarov
 * 
 *  Целью паттерна Адаптер является  изменение  интерфейса  и  приведение
 * его к тому виду, на который рассчитан 
клиент. Целью паттерна Фасад является 
упрощение интерфейса подсистемы.

 * 
 */
public class Main {
    
    public static void main(String[] args){
                 DvdPlayer dvd = new DvdPlayer(); 
                 Screen screen = new Screen();
                 PopcornPopper popper = new PopcornPopper();
        
        // при фасаде мы передаем уже готовые объекты в него
        HomeTheaterFacade homeTheater = 
                new HomeTheaterFacade(dvd, screen, popper);
 
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();

    }
    
}