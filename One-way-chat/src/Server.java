import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server");
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("A new client is added");
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("enter message");
                String name = scanner.nextLine();
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(outputStream,true);
                pw.println(name);
            }
        }catch (IOException e){
            System.out.println("Not connected");
            throw new RuntimeException(e);
        }
    }
}