import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server");
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");
            //ACCEPT socket value message
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));// get input from the user without using scanner
            // for displaying message
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            String sendingMessage, recievingMessage;
            while (true){
                sendingMessage = userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();
                //recieving message from client
                recievingMessage = socketDataReader.readLine();
                System.out.println("Client:"+recievingMessage);
            }
        }catch (IOException e){
            System.out.println("Not connected");
            throw new RuntimeException(e);
        }
    }
}