/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;
/**
 *
 * @author nazarov
 * 
 * Клиент поиска в rmi
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            //MyRemote _remoteRegistry = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            final Registry registry = LocateRegistry.getRegistry("127.0.0.1", 2732); // это похоже порт
            for (String s : registry.list()) {
                System.out.println(s);
                MyRemote myRemote = (MyRemote) registry.lookup(s);
                System.out.println(myRemote.sayHello());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
