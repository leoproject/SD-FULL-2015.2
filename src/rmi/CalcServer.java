package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalcServer {
    public static void main (String args[]) throws RemoteException{
        Calc calc = new Calc();
        Bool  bool = new Bool() {};
        System.out.println("Criando novos metodos");
        IBool stubB =(IBool)UnicastRemoteObject.exportObject(bool, 7788);
        ICalc stubC = (ICalc)UnicastRemoteObject.exportObject(calc, 7788);
        System.out.println("Expostando objeto");
        Registry reg = LocateRegistry.createRegistry(9900);
        System.out.println("Criando registro");
        reg.rebind("bool1", stubB);
        reg.rebind("calc1", stubC);
        System.out.println("Calc server ligado.");
    }
}