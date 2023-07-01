import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException {
        File fobj = new File("just.txt");
        fobj.createNewFile();

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter what you want to write in a file");
        String str = obj.nextLine();

        FileWriter wobj = new FileWriter(fobj);
        wobj.write(str);
        wobj.close();

        FileReader robj = new FileReader(fobj);
        BufferedReader buff = new BufferedReader(robj);
        String content = buff.readLine();
        while (content!=null){
            System.out.println(content);
            content= buff.readLine();
        }
    }
}