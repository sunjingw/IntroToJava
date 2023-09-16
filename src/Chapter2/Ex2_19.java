package Chapter2;

import java.util.Scanner;

public class Ex2_19 {
    public static void main(String[] args) {

        //Geometry - area of a triangle
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for a triangle: ");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();


        double area = Math.abs(0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)));


        System.out.println("The area of the triangle is " + area);
    }
}
