package Chapter6;

import java.util.Scanner;

public class Ex6_10 {
    public static void main(String[] args) {

        //Use the isPrime Method
        Scanner input = new Scanner(System.in);

        int count = 0;
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {

                System.out.print(i + " ");
                count++;

                if (count % 10 == 0)
                    System.out.println();

            }


        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
