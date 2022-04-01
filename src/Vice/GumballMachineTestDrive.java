/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nazarov
 * 
 * Будут реализованы механизмы взаимодействия объектов по сети(технология RMI)
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachineTestDrive gumballMachineTestDrive = new GumballMachineTestDrive();
        
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.out.println("Start default Machines!!! ");
            //System.exit(1);
            gumballMachineTestDrive.createDefaultRegistration();
        }else{
            gumballMachineTestDrive.createSingleRegistration(args[0], args[1]);
        }
    }
    
    private void createSingleRegistration(String link, String count){
        /*
            метод для передачи данных из входных переменных пользователя
        */
        try {
            GumballMachine gumballMachine = new GumballMachine(link, Integer.parseInt(count));
//          GumballMonitor monitor = new GumballMonitor(gumballMachine); // было до этого
//          monitor.report();
            final Registry registry = LocateRegistry.createRegistry(2732);
            registry.rebind("//" + link + "/gumballMachine", gumballMachine);

        } catch (RemoteException ex) {
            Logger.getLogger(GumballMachineTestDrive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void createDefaultRegistration(){
        /*
        дли подняти сервисов по умолчанию.
        */
        // три переменные что бы не запускать данные из консоли.
        String[] location = {"santafe.mightygumball.com", 
                             "boulder.mightygumball.com",
                             "seattle.mightygumball.com"};
        int[] countsApparat = {100, 120, 250};
        
        try {
            final Registry registry = LocateRegistry.createRegistry(2732); //  а вот тут нужно узнавать есть ли регистрация сервиса.
            for (int i = 0; i < location.length; i++) {
                GumballMachine gumballMachine = new GumballMachine(location[i], countsApparat[i]);
                registry.rebind("//" + location[i] + "/gumballMachine", gumballMachine);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(GumballMachineTestDrive.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}