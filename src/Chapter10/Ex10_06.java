package Chapter10;

import java.util.Scanner;

public class Ex10_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StackOfInteger primes = new StackOfInteger(100);
        int number = 2;

        while (number < 120) {
            if (isPrime(number))
                primes.push(number);

            number++;
        }

        while (!primes.empty()) {
            System.out.print(primes.pop() + " ");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
