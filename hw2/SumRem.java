import java.rmi.*;
public interface SumRem extends Remote
{
    public int addNum(int a, int b) throws RemoteException;
}