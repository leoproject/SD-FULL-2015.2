package rmi;

import java.rmi.RemoteException;

public interface IBool extends java.rmi.Remote{
    public boolean comp(boolean x, boolean y) throws RemoteException;
}
