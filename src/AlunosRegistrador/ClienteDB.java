package AlunosRegistrador;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClienteDB {
    public static void main (String args[]) throws RemoteException, NotBoundException{
        Registry reg = LocateRegistry.getRegistry("localhost", 9955);
        IAlunosDB db = (IAlunosDB)reg.lookup("alunosdb");
        
        Aluno a1 = new Aluno(12,"tarcisio","190");
        Aluno a2 = new Aluno(13,"pedro", "180");
        db.add(a1);
        db.add(a2);
        //Aluno t = t.getMatric(12);
    }
}
