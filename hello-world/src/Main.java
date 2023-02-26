import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //  int age = 60;

        //if(age==40){
        //  System.out.println("Buy a new house");
        //}
        //else if(age==60){
        //   System.out.println("I will retire");
        //}
        //else{
        //  System.out.println("Buy an old Car");
        //}
        //}
        //Switch case
        int age = 40;
        switch (age) {
            case 40:
                System.out.println("Buy a new house");
                break;
            case 60:
                System.out.println("I will retire");
                break;
            default:
                System.out.println("Buy an old car");
                break;
        }
    }
}