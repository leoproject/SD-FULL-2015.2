package AlunosRegistrador;

import java.rmi.RemoteException;

public interface IAlunosDB extends java.rmi.Remote{
    public boolean add(Aluno a) throws RemoteException;
    public Aluno get (int matric) throws RemoteException;
    public Aluno del (int matric) throws RemoteException;
}
