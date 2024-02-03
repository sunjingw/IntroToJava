package Chapter10;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BigInteger prime = new BigInteger(String.valueOf(Long.MAX_VALUE));


        int count = 0;
        while (count < 5) {

            if (prime.isProbablePrime(Integer.MAX_VALUE)) {
                System.out.println(prime);
                count++;
            }
            prime = prime.add(BigInteger.ONE);
        }

        System.out.println(new BigInteger("9223372036854775808").divide(BigInteger.TWO));
    }
}
