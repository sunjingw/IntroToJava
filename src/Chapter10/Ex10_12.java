package Chapter10;

import java.util.Scanner;

public class Ex10_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));

        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.contains(new MyPoint(3, 3)));


    }
}
