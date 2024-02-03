package Chapter13.Chapter13_15;

import java.math.BigInteger;
import java.math.RoundingMode;

public class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private BigInteger[] r = new BigInteger[2];

    /** Construct a ratinoal with default properties */
    public Rational() {

        this (new BigInteger("0"), new BigInteger("1"));
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        r[0] = (denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : BigInteger.valueOf(-1))
                .multiply(numerator.divide(gcd));
        r[1] = denominator.abs().divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = BigInteger.ONE.add(k)) {
            if (BigInteger.ZERO.compareTo(n1.remainder(k)) == 0 && BigInteger.ZERO.compareTo(n2.remainder(k)) == 0)
                gcd = k;
        }

        return gcd;
    }


    public void addNumerator(BigInteger n) {
        r[0] = r[1].multiply(n).add(r[0]);
    }
    public BigInteger getNumerator() {
        return r[0];
    }

    /** Return denominator */
    public BigInteger getDenominator() {
        return r[1];
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
        BigInteger n = r[0].multiply(secondRational.getDenominator()).add(r[1].multiply(secondRational.getNumerator()));
        BigInteger d = r[1].multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
//    public Rational subtract(Rational secondRational) {
//        BigInteger n = r[0] * secondRational.getDenominator()
//                - r[1] * secondRational.getNumerator();
//        BigInteger d = r[1] * secondRational.getDenominator();
//        return new Rational(n, d);
//    }
//
//    /** Mulitply a rational number by this rational */
//    public Rational multiply(Rational secondRational) {
//        BigInteger n = r[0] * secondRational.getNumerator();
//        BigInteger d = r[1] * secondRational.getDenominator();
//        return new Rational(n, d);
//    }
//
//    /** Divide a rational number by this rational */
//    public Rational divide(Rational secondRational) {
//        BigInteger n = r[0] * secondRational.getDenominator();
//        BigInteger d = r[1] * secondRational.getNumerator();
//        return new Rational(n, d);
//    }

    @Override
    public String toString() {
        if (r[1].equals(BigInteger.ONE))
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

//    @Override // Override the equals method in the Object class
//    public boolean equals(Object other) {
//        if ((this.subtract((Rational)(other))).getNumerator().equals(BigInteger.ZERO))
//            return true;
//        else
//            return false;
//    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int)doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return r[0].multiply(BigInteger.ONE).divide(r[1]).doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long)doubleValue();
    }

    @Override // Implement the compareTo method in Coparable
    public int compareTo(Rational o) {
//        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
//            return 1;
//        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
//            return -1;
//        else
            return 0;
    }
}