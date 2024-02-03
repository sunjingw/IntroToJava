package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_06 {
    public static void main(String[] args) {

        //Revise 5.15 PrimeNumber.java
        Scanner input = new Scanner(System.in);

        int[] primes = new int[50];
        int index = 0;

        for (int i = 2; i < 1000; i++) {

            if (index == 50)
                break;

            if (isPrime(i)) {
                primes[index++] = i;
                System.out.print(i + " ");

                if (index % 10 == 0)
                    System.out.println();
            }
        }


    }
    public static boolean isPrime (int number) {

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
