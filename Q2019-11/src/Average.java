import java.util.Scanner;

public class Average implements Sum{
    @Override
    public void add() {
        int sum = 0,m;
        System.out.println("Enter the numbers you want to know sum and average:");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter The Number "+i+": ");
            m=num.nextInt();
            sum = sum+m;
        }
        System.out.println("The sum is "+sum);
        System.out.println("The average of given numbers are "+sum/n);
    }
}
