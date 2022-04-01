/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nazarov
 * 
 * UnicastRemoteObject реализует интерфейс Serializable, 
    поэтому понадобится поле serialVersionUID
    * 
    * Не регистрируется класс в rmi в Naming, из ручного режима =\
 * 
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;



    @Override
    public String sayHello() {
       return "Server says, ‘Hey’";
   }
   
    //  обязательно создаем пустой конструктор с исключением так как это сделано у нас в родители
   public MyRemoteImpl() throws RemoteException { }
   public static void main (String[] args) {
           
        try {
            MyRemote service = new MyRemoteImpl();
            //Naming.rebind("RemoteHello", service); // так из книги не работает            
            final Registry registry = LocateRegistry.createRegistry(2732);
            registry.rebind("RemoteHello", service);            
        } catch (RemoteException ex) {
            Logger.getLogger(MyRemoteImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
   }
}