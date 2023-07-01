import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
    public int swap(int a,int b)throws RemoteException;
}
