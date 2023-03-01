import java.sql.SQLOutput;

public class Person {
    String Name;
    int Age ;
    Person(String s, int a){
        Name = s;
        Age = a;
    }
    void introduce(){
        System.out.println("My name is "+Name);
        System.out.println("age is "+Age);

    }
}
