package Chapter5;

import java.util.Scanner;

public class Ex5_25 {
    public static void main(String[] args) {

        //Compute pi
        Scanner input = new Scanner(System.in);

        double pi1 = 0;
        double pi2 = 0;
        double pi3 = 0;

        for (int j = 1; j < 10000; j++) {

            pi1 = (Math.pow(-1, j + 1)) / (2 * j - 1) + pi1;
        }

        for (int k = 1; k < 20000; k++) {

            pi2 = (Math.pow(-1, k + 1)) / (2 * k - 1) + pi2;
        }

        for (int m = 1; m < 100000; m++) {
            pi3 = (Math.pow(-1, m + 1)) / (2 * m - 1) + pi3;
        }

        System.out.println(pi1 * 4);
        System.out.println(pi2 * 4);
        System.out.println(pi3 * 4);
    }
}
