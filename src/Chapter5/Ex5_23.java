package Chapter5;

import java.util.Scanner;

public class Ex5_23 {
    public static void main(String[] args) {

        //Demonstrate cancellation errors
        Scanner input = new Scanner(System.in);

        double rightoLeft = 0;

        double leftToRight = 0;

        for (double i = 50000; i > 0; i--) {
            rightoLeft = rightoLeft + (1/i);
        }

        for (double i = 1; i <= 50000; i++) {
            leftToRight = leftToRight + (1/i);
        }

        System.out.println("Left to Right = " + (1000000 + leftToRight));

        System.out.println("Right to Left = " + (1000000 + rightoLeft));
    }
}
