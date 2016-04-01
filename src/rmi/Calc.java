package rmi;

import java.rmi.RemoteException;

public class Calc implements ICalc{
    public int add(int x, int y) throws RemoteException{
        return (x+y);
    }
    public int mult(int x, int y) throws RemoteException{
        return (x*y);
    }
}
