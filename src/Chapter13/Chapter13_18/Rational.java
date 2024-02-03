package Chapter13.Chapter13_18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.*;

public class Rational extends Number implements Comparable<Rational>{
    private BigDecimal numerator;
    private BigDecimal denominator;


    public Rational (){
        this(BigDecimal.ZERO,BigDecimal.ONE);
    }
    public Rational (BigDecimal numerator, BigDecimal denominator) {
        BigDecimal gcd = gcd(numerator, denominator);
        this.numerator = (denominator.compareTo(BigDecimal.ZERO) > 0 ? BigDecimal.ONE : BigDecimal.valueOf(-1)).multiply(numerator.divide(gcd));
        this.denominator = denominator.abs().divide(gcd);

    }
    private static BigDecimal gcd(BigDecimal n, BigDecimal d){
        BigDecimal n1 = n.abs();
        BigDecimal n2 = d.abs();
        BigDecimal gcd = BigDecimal.ONE;

        for (BigDecimal k = BigDecimal.ONE; k.compareTo(n1) < 0 && k.compareTo(n2) < 0; k = BigDecimal.ONE.add(k)) {
            if (BigDecimal.ZERO.compareTo(n1.remainder(k)) == 0 && BigDecimal.ZERO.compareTo(n2.remainder(k)) == 0)
                gcd = k;
        }
        return gcd;
    }

    public BigDecimal getNumerator() {
        return numerator;
    }

    public BigDecimal getDenominator() {
        return denominator;
    }

    public BigDecimal add(Rational r) {
        BigDecimal n = numerator.multiply(r.getDenominator()).add(denominator.multiply(r.getNumerator()));
        BigDecimal d = denominator.multiply(r.getDenominator());
        //return new Rational(n, d);
        return n.divide(d, 10, RoundingMode.HALF_EVEN);
    }

//    public Rational multiply(Rational r) {
//        BigDecimal n = numerator.multiply(r.getNumerator());
//        BigDecimal d = denominator.multiply(r.getDenominator());
//        return new Rational(n, d);
//    }

//    public Rational subtract(Rational r) {
//        BigDecimal n = numerator * r.getDenominator() - denominator * r.getNumerator();
//        BigDecimal d = denominator * r.getDenominator();
//        return new Rational(n, d);
//    }

    public BigDecimal getBigDecimalValue() {

        return numerator.divide(denominator, 30, RoundingMode.HALF_EVEN);
    }
    public Rational divide(Rational r) {
        BigDecimal n = numerator.multiply(r.getDenominator());
        BigDecimal d = denominator.multiply(r.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.compareTo(BigDecimal.ONE) == 0)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        return 0;
    }
}
