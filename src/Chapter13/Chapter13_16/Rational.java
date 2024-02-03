package Chapter13.Chapter13_16;

public class Rational extends Number implements Comparable<Rational>{
    private long numerator;
    private long denominator;


    public Rational (){
        this(0,1);
    }
    public Rational (long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;

    }

    private static long gcd(long n, long d){
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational r) {
        long n = numerator * r.getDenominator() + denominator * r.getNumerator();
        long d = denominator * r.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational r) {
        long n = numerator * r.getNumerator();
        long d = denominator * r.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational r) {
        long n = numerator * r.getDenominator() - denominator * r.getNumerator();
        long d = denominator * r.getDenominator();
        return new Rational(n, d);
    }
    public Rational divide(Rational r) {
        long n = numerator * r.getDenominator();
        long d = denominator * r.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }
    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator() < 0) {
            return -1;
        } else
            return 0;
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
        return numerator * 1.0 / denominator;
    }
}
