package Chapter18;

import java.math.BigInteger;
import java.util.*;

public class Ex18_01 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        BigInteger n = input.nextBigInteger();

        long start = System.currentTimeMillis();
        System.out.println(factorial(n));
        long end = System.currentTimeMillis();
        long elapsed = end - start;
        System.out.println(elapsed);

        long start1 = System.currentTimeMillis();
        System.out.println(factorial(n, BigInteger.ONE));
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);
    }

    public static BigInteger factorial(BigInteger n) {

        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static BigInteger factorial(BigInteger n, BigInteger m) {

        if (n.equals(BigInteger.ZERO)) {
            return m;
        } else {

            return factorial(n.subtract(BigInteger.ONE), n.multiply(m));
        }
    }

}
