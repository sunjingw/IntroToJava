package Chapter6;

import java.util.Scanner;

public class Ex6_14 {
    public static void main(String[] args) {

        //Estimate PI
        Scanner input = new Scanner(System.in);

        System.out.println("i\t\t\t\tm(i)");

        for (int i = 1; i < 1000; i += 100) {

            System.out.println(i + "\t\t\t\t" + (4 * printM(i)));
        }
    }

    public static double printM(int i) {

        double total = 0;

        for (int k = 1; k <= i; k++) {

            total += (Math.pow(-1, k+1)) / (2 * k - 1);

        }

        return total;

    }
}
