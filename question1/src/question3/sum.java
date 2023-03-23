package question3;

public class sum {
    public static void main(String[] args) {
        //Find the sum of the element of array using while loop
        int[] a ={1,2,3,4,5};
        int sum=0,i=0;
        while( i<a[4]){
           sum=sum+a[i];
           i++;
            //System.out.println("The sum of the number is "+sum);
        }
        System.out.println("The sum of the number is "+sum);
    }
}
