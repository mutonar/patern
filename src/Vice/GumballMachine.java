/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vice;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author nazarov
 * 
 * Патерн Заместитель
 */
public class GumballMachine
extends UnicastRemoteObject implements GumballMachineRemote 
{
    private static final long serialVersionUID = 2L;
    String location;
    int count = 0;
    State state = new NoQuarterState(); // хитрый класс которого часть объекта не сериализуется
 
    public GumballMachine(String location, int count)  throws RemoteException {
        this.location = location;
    }
 
    public String getLocation() {
        return location;
    }
 
    @Override
    public int getCount() throws RemoteException{
        return count;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }
}