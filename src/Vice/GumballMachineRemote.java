/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.Remote;
import java.rmi.RemoteException;
/*
интерфейс удаленного доступа для GumballMachine. Интерфейс 
предоставляет набор методов, вызываемых в удаленном режиме. 

*/

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}