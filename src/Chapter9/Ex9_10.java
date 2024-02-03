package Chapter9;

import java.util.Scanner;

public class Ex9_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    QuadraticEquation a = new QuadraticEquation(1, 3, 1);
    QuadraticEquation b = new QuadraticEquation(1, 2, 1);
    QuadraticEquation c = new QuadraticEquation(1, 2, 3);

    QuadraticEquation[] arr = new QuadraticEquation[3];

    arr[0] = a;
    arr[1] = b;
    arr[2] = c;

    for (int i = 0; i < arr.length; i++) {
        checkDiscriminant(arr[i]);
    }

    }

    public static void checkDiscriminant(QuadraticEquation a) {
        if (a.getDiscriminant() > 0)
            System.out.println("The equation has two roots: " + a.getRoot1() + " and " + a.getRoot2());
        else if (a.getDiscriminant() == 0)
            if (a.getRoot1() != 0)
                System.out.println("The equation has one root: " + a.getRoot1());
            else
                System.out.println("The equation has one root: " + a.getRoot2());
        else {
            System.out.println("The equation has no roots");
        }

    }
}

