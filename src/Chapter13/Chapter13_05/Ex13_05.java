package Chapter13.Chapter13_05;

import java.util.*;

public class Ex13_05 {
    public static void main(String[] args) {

        //Enable GeometricObject Comparable
        Scanner input = new Scanner(System.in);

        GeometricObject cir1 = new Circle(5);
        GeometricObject cir2 = new Circle(10);
        GeometricObject rec1 = new Rectangle(2, 2);
        GeometricObject rec2 = new Rectangle(5, 5);

        System.out.println(GeometricObject.max(cir1, cir2));

        System.out.println(GeometricObject.max(rec1, rec2));

        System.out.println(GeometricObject.max(cir2, rec2));
    }
}
