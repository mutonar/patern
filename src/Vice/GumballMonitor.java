/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nazarov
 */
public class GumballMonitor {
    GumballMachineRemote machine;
 
    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }
 
    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException ex) {
            Logger.getLogger(GumballMonitor.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
