package Chapter3;

import java.util.Scanner;

public class Ex3_03 {
    public static void main(String[] args) {

        //Algebra - solve 2x2 linear equations
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        double empty = a * d - b * c;

        if ((int)empty == 0) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
