package Chapter4;

import java.util.Scanner;

public class Ex4_01 {
    public static void main(String[] args) {

        //Geometry - area of a pentagon
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex: ");

        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);

        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagon is " + area);
    }
}
