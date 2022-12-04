//client
import java.io.*;
import java.util.*;
import java.rmi.*;
import java.net.*;

public class Client {
    public static void main(String args[]){
        String host="localhost";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        try{
            SumRem remoteobject = (SumRem) Naming.lookup("rmi://"+host+"/SumRem");
            System.out.println(remoteobject.addNum(a,b));
        }
        catch (RemoteException re){
            re.printStackTrace();
        }
        catch(NotBoundException nbe){
            nbe.printStackTrace();
        }
        catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }
    }



}
