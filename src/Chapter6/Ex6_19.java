package Chapter6;

import java.util.Scanner;

public class Ex6_19 {
    public static void main(String[] args) {

        //The MyTriangle class
        Scanner input = new Scanner(System.in);


        System.out.println("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println("The area is " + area(side1, side2, side3));
        } else
            System.out.println("Invalid area");

    }

    /**
     * Return true if the sum of any two sides is greater than the third side
     */
    public static boolean isValid(double side1, double side2, double side3) {

        if ((side1 + side2 > side3) || (side2 + side3 > side1) || (side1 + side3 > side2)) {
            return true;
        } else
            return false;
    }

    /**
     * Return the area of the triangle
     */
    public static double area(double side1, double side2, double side3) {

        double side = (side1 + side2 + side3) / 2;
        return Math.sqrt(side * (side - side1) * ( side - side2) * (side - side3));

    }
}
