import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Service obj = (Service) Naming.lookup("rmi://localhost:5099/hello");
       int n1,n2;
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the first number");
        n1 = obj1.nextInt();
        System.out.println("Enter the second number");
        n2 = obj2.nextInt();
        int number = obj.swap(n1,n2);
        System.out.println("The greatest number is "+number);



    }
}
