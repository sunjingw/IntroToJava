package Chapter13.Chapter13_21;

import java.util.*;

public class Rational extends Chapter13.Chapter13_16.Rational {

    private int a;
    private int b;
    private int c;
    private int numerator;
    private int denominator;

    public Rational(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Rational(Chapter13.Chapter13_16.Rational rational) {
        this.numerator = (int) rational.getNumerator();
        this.denominator = (int) rational.getDenominator();
    }

    public Rational h() {
        return new Rational(new Chapter13.Chapter13_16.Rational (-b, 2L * a)); //, r1.getDenominator());
    }

    public Rational k() {
        int discriminant = (b * b) - (4 * a * c);

        return new Rational (new Chapter13.Chapter13_16.Rational(-discriminant, 4L * a));
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
