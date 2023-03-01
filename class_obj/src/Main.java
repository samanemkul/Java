

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Shape object = new Shape(50,100);
////        System.out.println("Width of shape "+object.width);//brings the object of another class
////        System.out.println("Height of shape "+object.height);
////       //System.out.println("Area of shape "+object.Area);
//        //object.area();
//        Shape object2 = new Shape(100,200);
//        Shape obj = new Shape();

        Person object = new Person("Sama",19);
       // System.out.println("The name of the person is "object);
        object.introduce();
        System.out.println("Name"+object.Name);
        System.out.println("Age"+object.Age);


    }
}