package Chapter10;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BigInteger num = new BigInteger(Long.MAX_VALUE + "");

        int count = 0;

        System.out.println("long.max value = " + num);

        while (count < 5) {

            if (num.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
                    num.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {

                System.out.println(num);
                count++;
            }

            num = num.add(BigInteger.ONE);

        }

    }
}
