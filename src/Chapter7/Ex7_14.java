package Chapter7;

import java.util.Scanner;

public class Ex7_14 {
    public static void main(String[] args) {

        //Computing gcd
        Scanner input = new Scanner(System.in);

        int[] num = new int[5];

        System.out.println("Enter five numbers: ");

        for (int i = 0; i < num.length; i++) {

            num[i] = input.nextInt();
        }

        gcd(num);
    }

    public static int gcd(int... numbers) {

        int gcd = 2;

        for (int e : numbers) {
            System.out.print(e + " gcd is ");

            while (gcd <= e) {

                if (e % gcd == 0) {
                    System.out.print(gcd + " ");
                    e = e / gcd;
                }
                else
                    gcd++;
            }

            System.out.println();
        }

        return 1;
    }
}
