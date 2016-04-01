package AlunosRegistrador;

import java.rmi.RemoteException;
import java.util.Map;

public class AlunoDB implements IAlunosDB{
    Map<Integer,Aluno> table = hashtable<Integer, Aluno>();
    public boolean add(Aluno a) throws RemoteException{
        this.table.put(a.getMatric(), a);
        return true;
    }
    //...
}
