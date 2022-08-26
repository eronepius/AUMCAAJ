import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Product extends Remote{
     String getName() throws RemoteException;
     String getDesc()  throws RemoteException;
     double getPrice() throws RemoteException;

}