package Chapter7;

import java.util.Scanner;

public class Ex7_25 {
    public static void main(String[] args) {

        //Algebra - solve quadratic equations
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers for a, b, and c: ");

        double[] eqn = new double[3];
        double[] roots = new double[2];

        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        System.out.println("Number of roots: " + solveQuadratic(eqn, roots));
        for (double e : roots) {
            if (e != 0)
            System.out.println(e);
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {

        double discriminant = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];

        if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.sqrt((eqn[1] * eqn[1]) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt((eqn[1] * eqn[1]) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
            return 2;
        }
        else if (discriminant == 0) {
            roots[0] = (-eqn[1] + Math.sqrt((eqn[1] * eqn[1]) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
            roots[1] = 0;
            return 1;
        }
        else
            return 0;

    }
}
