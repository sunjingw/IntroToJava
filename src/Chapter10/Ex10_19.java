package Chapter10;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BigInteger p = new BigInteger("2");
        BigInteger num = new BigInteger("0");

        int prime = 2;
        System.out.println("p\t\t2^p-1");

        while (prime <= 100) {

            if (p.pow(prime).subtract(BigInteger.ONE).isProbablePrime(Integer.MAX_VALUE)) {
                System.out.print(prime + "\t\t" + p.pow(prime).subtract(BigInteger.ONE));
                System.out.println();
            }

            prime++;

        }
    }
}
