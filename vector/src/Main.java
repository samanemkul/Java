import java.util.Vector;
public class Main {
    public static void main(String[] args) {
        //vector = dynamic memory allocation
       // Vector age = new Vector();
        // Arrays are like boxes of a fixed size, while Vectors are like expandable boxes that can grow
        // or shrink as needed.

        // This is a fixed array of length 3
        int[] age = {10,20,30};
        Vector age2 = new Vector(3,10);
        age2.add(50);
        age2.add('v');
        age2.add(60);
        age2.add(20);
        age2.add(10);
        age2.add(30);
        age2.add(70);
        age2.add(80);
        age2.add(60);
        age2.add(60);
        age2.add(60);
        System.out.println(age2);
        System.out.println("Vector age capacity "+age2.capacity());// capacity increases by double if it exceed its capacity.


    }
}