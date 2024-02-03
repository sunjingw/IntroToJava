package Chapter13.Chapter13_18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Ex13_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        BigDecimal j = BigDecimal.ONE;
        BigDecimal k = BigDecimal.TWO;

        Rational r1 = new Rational();
        Rational r2 = new Rational();

        BigDecimal sum = BigDecimal.ZERO;

        for (BigInteger i = BigInteger.ONE; i.compareTo(new BigInteger("100")) < 0; i = i.add(BigInteger.ONE)) {
            r1 = new Rational(j, k);

            sum = sum.add(r1.getBigDecimalValue());

            System.out.println("#" + i + " - " + r1.getNumerator() + "/" + r1.getDenominator());

            j = j.add(BigDecimal.ONE);
            k = k.add(BigDecimal.ONE);

        }

        System.out.println(sum);
    }
}
