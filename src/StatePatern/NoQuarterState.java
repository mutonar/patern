/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatePatern;

/**
 *
 * @author nazarov
 */
public class NoQuarterState implements State { // Что захуета название метода интерфейса совпадает с именем конструктора
    GumballMachine gumballMachine;

    NoQuarterState(GumballMachine gumballMachine) {
        setGumballMachine(gumballMachine);
    }
 
 
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
 
    public void ejectQuarter() {
        System.out.println("You haven’t inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there’s no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 

    @Override
    public void setGumballMachine(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
}