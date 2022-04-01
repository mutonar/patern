/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author nazarov
 * 
 * этот класс тестирует GumballMachineTestDrive 
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                             "rmi://boulder.mightygumball.com/gumballmachine",
                             "rmi://seattle.mightygumball.com/gumballmachine"}; 
 
       GumballMonitor[] monitor = null;
 
       try {
            final Registry registry = LocateRegistry.getRegistry("127.0.0.1", 2732); // это похоже порт
            String[] nameRegistry = registry.list();
            monitor = new GumballMonitor[nameRegistry.length];
            
            for (int i=0; i < registry.list().length; i++) {
                String s = nameRegistry[i];
                GumballMachineRemote machine = (GumballMachineRemote) registry.lookup(s);
                monitor[i] = new GumballMonitor(machine);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
        for(int i=0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }

}
