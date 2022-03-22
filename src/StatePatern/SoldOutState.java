/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatePatern;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        setGumballMachine(gumballMachine);
    }
 
    @Override
    public void insertQuarter() {
    }
    @Override
    public void ejectQuarter() {
    }
    @Override
    public void turnCrank() {
    }
    @Override
    public void dispense() {
    }

    @Override
    public void setGumballMachine(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
}
