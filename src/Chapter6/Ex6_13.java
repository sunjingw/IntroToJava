package Chapter6;

import java.util.Scanner;

public class Ex6_13 {
    public static void main(String[] args) {

        //Sum series
        Scanner input = new Scanner(System.in);

        System.out.println("i\t\t\t\tm(i)");
        printM(20);
    }

    public static double printM(double num) {

        double m = 0;

        for (double i = 1; i <= num; i++) {

            m += i / (i + 1);

            //for (double j = 1; j <= i; j++) {
             //   m += j / (j + 1);
            //}

            System.out.printf("%1.0f\t\t\t\t%1.4f\n", i, m);
        }

        return m;
    }
}
