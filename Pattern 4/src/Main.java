public class Main {
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=0;i<4;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (i = 4; i>=0; i--) {
            for (j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}