public class Main {
    public static void main(String[] args) {
//        int x[] = {1,2,3,4,5,6,7,88,9,10};
//        int[] y = {10, 20, 30};
//        int i;
//        for (i = 0; i < 10; i++) {
//
//            System.out.println("x " + x[i]);
//        }
//       //(Syntax for(datatype element: array)
//            for (int element : y) {
//                System.out.println(element);
//            }
        // two dimnesional array
        int [] x = {10,20,30};
        int [][]y ={{10,20,30},
                    {20,90,100};
                    {50,30,40}};
        System.out.println(x[1]);
        System.out.println(y[0][1]);
        for(int i=0;i<2;i++){
            System.out.println("x" +x[i]);
        }

    }
}