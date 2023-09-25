package Chapter4;

import java.util.Scanner;

public class Ex4_05 {
    public static void main(String[] args) {

        //Geometry - area of a regular polygon
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides: ");

        double n = input.nextDouble();

        System.out.println("Enter the length of side: ");
        double s = input.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

        System.out.println("The area of the polygon is " + area);

    }
}
