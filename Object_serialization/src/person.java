import java.io.Serializable;

public class person implements Serializable {
    int age = 25;
    String name = "Sama Nemkul";
    double height = 5.2;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
}
