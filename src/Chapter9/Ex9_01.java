package Chapter9;

import java.util.Scanner;

public class Ex9_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1's height " + r1.height);
        System.out.println("Rectangle 1's width " + r1.width);
        System.out.println("Rectangle 1's area " + r1.getArea());
        System.out.println("Rectangle 1's perimeter " + r1.getPerimeter());

        System.out.println("Rectangle 2's height " + r2.height);
        System.out.println("Rectangle 2's width " + r2.width);
        System.out.println("Rectangle 2's area " + r2.getArea());
        System.out.println("Rectangle 2's perimeter " + r2.getPerimeter());
    }
}
