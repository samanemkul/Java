public class Main {
    public static void main(String[] args) {
        int [] x = {10,20,30};
        int [][]y ={{10,20,30},
                    {20,90,100},
                    {50,30,40}};
//        System.out.println(x[1]);
//        System.out.println(y[0][1]);
//        for(int i=0;i<2;i++){
//            System.out.println("x" +x[i]);
//        }
//        for(int i=0;i<3;i++){
//           // System.out.println("Looping in row");
//            for(int j=0;j<3;j++){
//                System.out.println(y[i][j]);
//            }
        for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                System.out.println(y[i][j]);i
            }
        }
    }
}