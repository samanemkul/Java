package pattern;

public class pat {
    public static void main(String[] args) {
        int i = 0, j = 0,k=0;
        for (i = 0; i <= 5; i++) {
            for (j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            for(k=0;k<=5-1-i;k++) {

                System.out.print("*"+" ");
            }
                System.out.println();
            }
        }
    }

