public class Main {
    public static void main(String[] args) {
        String isloading = "True..";
        try{
            int divider = 0;
            int value = 100;
            int result = value/divider;
//            if(divider==0){
//                throw new Exception();
//            }
            System.out.println("Result is "+result);
        }catch(Exception e){
            System.out.println("Error");
        }finally {
            isloading = "False..";
            System.out.println("This is finally block");
        }
        anotherWork();
    }
    static void anotherWork(){
        System.out.println("Another work");
    }
}