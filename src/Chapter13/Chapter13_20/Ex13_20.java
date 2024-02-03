package Chapter13.Chapter13_20;

import java.util.*;
import Chapter13.Chapter13_17.Complex;

public class Ex13_20 {
    public static void main(String[] args) {

        //Algebra - solve quadratic equations
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(n1, n2, n3);

        Complex c = new Complex(qe);

        if (qe.discriminant() == 2) {
            System.out.println("The roots are " + qe.root1 + " and " + qe.root2);
        } else if (qe.discriminant() == 1) {
            System.out.println("The root is " + qe.root1);
        } else {
            System.out.println("The roots are " + c.getRealPartofRoot() + " + " + c.getImaginaryPartofRoot() +
                    " and " + c.getRealPartofRoot() + " - " + c.getImaginaryPartofRoot() );
        }

    }
}
