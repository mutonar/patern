/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StatePatern;

import java.util.Random;

/**
 *
 * @author nazarov
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    HasQuarterState(GumballMachine gumballMachine) {
        setGumballMachine(gumballMachine);
    }

 
    @Override
    public void setGumballMachine(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }
 
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
 
    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

   
}