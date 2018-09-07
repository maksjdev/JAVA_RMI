package calculatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalculatorRmi extends UnicastRemoteObject implements CalculatorInterface{
    public CalculatorRmi() throws RemoteException
    {
        int a,b;
    }
    public int add(int a , int b)throws RemoteException
    {
        return a+b;
    }
    public int sub(int a , int b)throws RemoteException
    {
        return a-b;
    }
    public int mul(int a , int b)throws RemoteException
    {
        return a*b;
    }
    public int div(int a , int b)throws RemoteException
    {
        return a/b;
    }
}
