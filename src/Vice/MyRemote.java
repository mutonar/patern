/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author nazarov
 * 
 *  Если вы передаете пользовательские типы, проследите за тем,
 * чтобы ваши классы реализовали интерфейс Serializable
 * 
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException; // передача по сети рисковая по этому обязательно исключения
}
