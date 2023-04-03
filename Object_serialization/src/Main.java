
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException, ClassNotFoundException{
        FileOutputStream fileOutputStream = new FileOutputStream("Sama.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        person p=new person();
        objectOutputStream.writeObject(p);


        FileInputStream fileInputStream = new FileInputStream("Sama.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        person p1 = (person) objectInputStream.readObject();
        System.out.println( p1.getName());;
        System.out.println( p1.getAge());;

    }
}