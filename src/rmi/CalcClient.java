package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcClient {
    public static void main(String args[]) throws RemoteException, NotBoundException{
        Registry reg = LocateRegistry.getRegistry("localhost", 9900);
        IBool bool = (IBool) reg.lookup("bool1");
        ICalc calc = (ICalc) reg.lookup("calc1");
        int z = calc.add(5,3);
        boolean x = bool.comp(true, false);
        System.out.println(z);
        System.out.println(x);
    }
}
