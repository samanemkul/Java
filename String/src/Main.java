import javax.management.monitor.StringMonitor;

public class Main {
    public static void main(String[] args) {
       String name ="Sama";
        name = name +"Shrestha";
        System.out.println(name);
        // this will create the new instance of the string
        String name2 = new String("Hello World");
        // Concatenate two strings int the same memory space(overwriting the previous)
        StringBuffer name3 = new StringBuffer("Sama");
        System.out.println(name3);

    }
}

