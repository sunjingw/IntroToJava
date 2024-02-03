package Chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex10_20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BigDecimal e = new BigDecimal(1);

        for (int i = 1; i < 1000; i++) {

            e = e.add(new BigDecimal(1).divide(new BigDecimal(factorial(i)), 25, BigDecimal.ROUND_UP));

        }

        System.out.println(e);
    }

    public static BigInteger factorial(int n) {
        BigInteger num = new BigInteger("1");

        for (BigInteger i = BigInteger.valueOf(n); i.compareTo(BigInteger.valueOf(0)) > 0; i = i.subtract(BigInteger.valueOf(1))) {

            num = num.multiply(i);
        }

        return num;
    }
}
