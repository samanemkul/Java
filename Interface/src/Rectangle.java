public class Rectangle implements Shape,AnotherShape {


    @Override
    public void getArea() {
        System.out.println("The area of the given function");
    }

    @Override
    public void getColor() {
        System.out.println("The color of the object");
    }
}
