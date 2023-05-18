import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Client");
        try{
            Socket socket = new Socket("localhost",12345);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            Scanner scanner = new Scanner(System.in);
            while(true){
                int c = inputStreamReader.read();
                while (c!= -1){
                    System.out.print((char) c);
                    c = inputStreamReader.read();
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
