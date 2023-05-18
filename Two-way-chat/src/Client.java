import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client");
        try{
            Socket socket = new Socket("172.25.21.6",12345);
            //accept socket value message
            BufferedReader socketDataReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));// get input from the user without using scanner
            // for displaying message//
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);
            String sendingMessage, recievingMessage;
            while (true){
                //recieving message from client
                recievingMessage = socketDataReader.readLine();
                System.out.println("Server:"+recievingMessage);
                sendingMessage = userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();
            }
            }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
