import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write the program to find the number is prime or not
        System.out.println("Enter the number to find whether it is prime or not");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int i=0,count=0;
        for(i=1;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("It is prime");
        }
        else{
            System.out.println("It is not prime");
        }

    }
}