import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Numbers extends UnicastRemoteObject implements Service  {
    protected Numbers() throws RemoteException{
        super();
    }
    @Override
    public int swap(int n1,int n2) throws RemoteException {
        int temp;
        if(n1>n2){
            temp=n1;
            return temp;

        }
        else{
            temp = n2;
            return temp;
        }

    }
}
