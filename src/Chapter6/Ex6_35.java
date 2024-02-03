package Chapter6;

import java.util.Scanner;

public class Ex6_35 {
    public static void main(String[] args) {

        //Geometry - area of a pentagon
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + area(side));
    }

    public static double area(double side) {

        return (5 * side * side) / (4 * Math.tan(Math.PI/5));

    }
}
