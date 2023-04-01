import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        File file = new File("Sama.txt");

            // This will create a file
            file.createNewFile();

        //Write something on file

            FileWriter fileWriter = new FileWriter("Sama.txt");// to write in a file
            fileWriter.write("Hey this is file");
            fileWriter.close();



            FileReader fileReader = new FileReader("Sama.txt");//to read from file.
            int value;
                while ((value =fileReader.read())!=-1) {
                    System.out.print((char) value);
                    fileReader.close();
                }

        // to delete a file
        file.delete();

    }
}