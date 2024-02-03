package Chapter9;

import java.util.Scanner;

public class Ex9_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LinearEquation a = new LinearEquation(9, 4, 3, -5, -6, -21);
        LinearEquation b = new LinearEquation(1, 2, 2, 4, 4, 5);

        if (a.isSolvable())
            System.out.println("x is " + a.getX() + " y is " + a.getY());
        else
            System.out.println("The equation has no solution");

        if (b.isSolvable())
            System.out.println("x is " + a.getX() + " y is " + a.getY());
        else
            System.out.println("The equation has no solution");
    }
}
