import java.util.Scanner;
public class Assign1{
    public static void main(String[] args){
        System.out.println("What is the total number of Employees?");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("What is the Name of supervisor?");
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println("How many times the Nuclear waste is removed from the core?");
        Scanner inp = new Scanner(System.in);
        int numb = inp.nextInt();
        System.out.println("What is the total weight of the waste produced every 1 week?");
        Scanner obj1 =new Scanner(System.in);
        float input1 = obj1.nextFloat();
        System.out.println("Is Electric Motor being replaced every 18 days? [Press 'y' for yes and 'n' for no]");
        Scanner object= new Scanner(System.in);
        char inpp = object.next().charAt(0);
        System.out.println("What is the core average temperature ( celsius ) of the Nuclear Reactor?");
        Scanner temp = new Scanner(System.in);
        double tempr = temp.nextFloat();
        double tempk = tempr+273.15;
        System.out.println("\n\n");
        System.out.println("The total number of employee is "+num);
        System.out.println("The name of the supervisor is "+name);
        System.out.println("The nuclear waste is removed "+numb +" times from the core");
        System.out.println("The total weight of the waste produced in every one week is "+input1+ " tons");
        if(inpp=='y')
        {
            System.out.println("Yes,the electric motor is being replaced in every 18 days");
    
        }
        else{
            System.out.println("No,The electric motor is not being replace in every 18 days");
        }
        System.out.println("The core average temperature in celsius is "+ tempr+"C");
        System.out.println("The core average temperature in kelvin is "+tempk+ "k");
        
        


    }
}