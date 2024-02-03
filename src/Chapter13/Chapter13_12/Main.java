package Chapter13.Chapter13_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle c1 = new Circle(2);
        Circle c2 = new Circle(4);
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(3, 4);

        GeometricObject[] arr = new GeometricObject[4];
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = r1;
        arr[3] = r2;

        System.out.println(GeometricObject.sumArea(arr));


    }
}
