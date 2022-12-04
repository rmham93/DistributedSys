import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String args[]) {
        try{
            SumRemImp localobject= new SumRemImp();
            Naming.rebind("rmi:///SumRem", localobject);
        }
        catch (RemoteException re){
            re.printStackTrace();
        }
        catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }
    }
}
