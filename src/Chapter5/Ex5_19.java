package Chapter5;

import java.util.Scanner;

public class Ex5_19 {
    public static void main(String[] args) {

        //Display numbers in a pyramid pattern
        /**
         *           1
         *         1 2 1
         *       1 2 4 2 1
         *     1 2 4 8 4 2 1
         */
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 128; i*=2) {
            for (int k = 128; k >= 1; k/=2) {
                if (k > i)
                    System.out.print("    ");
            }

            for (int j = 1; j <= 128; j*=2) {
                if (j <= i) {
                    System.out.printf("%4d", j);
                }
            }

            for (int h = 128; h >= 1; h/=2) {
                if (h < i) {
                    System.out.printf("%4d", h);
                }
            }

            System.out.println();
        }
    }
}
