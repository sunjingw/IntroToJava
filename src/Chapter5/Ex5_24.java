package Chapter5;

import java.util.Scanner;

public class Ex5_24 {
    public static void main(String[] args) {

        //Sum a series
        Scanner input = new Scanner(System.in);

        double divisor = 3;
        double total = 0;

        for (double i = 1; i < 98; i+=2) {
            total = total + (i/divisor);

            System.out.println(i + "/" + divisor);
            divisor += 2;
        }

        System.out.println(total);
    }
}
