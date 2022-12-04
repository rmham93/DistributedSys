import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
public class SumRemImp extends UnicastRemoteObject implements SumRem
{
    public SumRemImp() throws RemoteException{}
    public int addNum(int a, int b){
        return (a+b);
    }


}