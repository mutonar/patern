/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatePatern;

/**
 *
 * @author nazarov
 *
 * Паттерн Состояние управляет изменением поведения объ-
    екта  при  изменении  его  внутреннего  состояния.  Внешне 
    это выглядит так, словно объект меняет свой класс.
     
   Это практически паттерне Состояние , только его поведение клиент не может
   поменять, изменяется он внутри себя сам

 */
public class Main {
 
     public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }
}
