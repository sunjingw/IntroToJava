package Chapter13.Chapter13_5;

import java.util.*;

public class TestGeometricObjectComparable {
    public static void main(String[] args) {

        GeometricObject c1 = new Circle(5);
        GeometricObject c2 = new Circle(10);

        GeometricObject r1 = new Rectangle(5, 10);
        GeometricObject r2 = new Rectangle(10, 10);

        System.out.println(GeometricObject.max(c1, c2).toString());
        System.out.println(GeometricObject.max(r1, r2).toString());


    }
}
