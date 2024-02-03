package Chapter6;

import java.util.Scanner;

public class Ex6_28 {
    public static void main(String[] args) {

        //Mersenne prime
        Scanner input = new Scanner(System.in);

        System.out.println("p\t\t\t2^p-1");
        for (int i = 2; i <= 31; i++) {

            if (isPrime((int)Math.pow(2, i) - 1)) {
                System.out.print(i + "\t\t\t" + (int)(Math.pow(2, i) - 1) + "\n");
            }
        }
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num/2; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
