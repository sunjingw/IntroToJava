package Chapter5;

import java.util.Scanner;

public class Ex5_18 {
    public static void main(String[] args) {

        //Display four patterns
        Scanner input = new Scanner(System.in);

        /**
         * Pattern A
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         */

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        /**
         * Pattern B
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();


        /**
         * Pattern C
         *       1
         *     2 1
         *   3 2 1
         * 4 3 2 1
         */

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();

        /**
         * Pattern D
         * 1 2 3 4
         *   2 3 4
         *     3 4
         *       4
         */

        for (int i = 6; i >= 1; i--) {
            for (int k = 6; k >= i; k--) {
                if (k > i)
                    System.out.print("  ");
            }

            for (int j = 1; j <= 6; j++) {
                if (j <= i)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
