package Chapter5;

import java.util.Scanner;

public class Ex5_17 {
    public static void main(String[] args) {

        //Display pyramid
        /**
         *         1
         *       2 1 2
         *     3 2 1 2 3
         *   4 3 2 1 2 3 4
         * 5 4 3 2 1 2 3 4 5
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of lines: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(" " + j);
                } else if (j > i) {
                    System.out.print("  ");
                }

            }

            for (int k = 2; k <= num; k++) {
                if (k <= i) {
                    System.out.print(" " + k);
                }
            }

            System.out.println();
        }


    }
}
