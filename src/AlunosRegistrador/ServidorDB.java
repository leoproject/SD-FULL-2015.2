package AlunosRegistrador;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServidorDB {
    public static void main(String[] args) throws Exception{
        AlunoDB db = new AlunoDB();
        IAlunosDB stub = (IAlunosDB)UnicastRemoteObject.exportObject(db, 8866);
        Registry reg = LocateRegistry.createRegistry(9955);
        reg.rebind("alunosdb", stub);
    }
}
