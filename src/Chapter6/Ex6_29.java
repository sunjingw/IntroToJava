package Chapter6;

import java.util.Scanner;

public class Ex6_29 {
    public static void main(String[] args) {

        //Twin primes
        Scanner input = new Scanner(System.in);

        for (int i = 2; i < 1000; i++) {

            if (isPrime(i)) {
                if (isPrime(i + 2)) {
                    System.out.print("(" + i + ", " + (i + 2) + ")\n");
                }
            }

        }


    }

    public static boolean isPrime (int num) {

        for (int i = 2; i <= num/2; i++) {

            if (num % 2 == 0)
                return false;
        }
        return true;
    }
}
