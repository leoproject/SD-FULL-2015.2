package rmi;

import java.rmi.RemoteException;

public class Bool implements IBool{
    public boolean comp(boolean x, boolean y)throws RemoteException {
        if (x == y) {
            return true;
        } else return false;
    }
}
