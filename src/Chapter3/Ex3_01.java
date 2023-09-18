package Chapter3;

import java.util.Scanner;

public class Ex3_01 {
    public static void main(String[] args) {

        //Algebra - solve quadratic equation
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);

        double root1, root2;

        root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
        root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

        if (discriminant > 0) {

            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }


    }
}
