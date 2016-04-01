package rmi;

import java.rmi.RemoteException;

public interface ICalc extends java.rmi.Remote{
    public int add(int x, int y) throws RemoteException;
    public int mult(int x, int y) throws RemoteException;    
}
