package Chapter13.Chapter13_17;

import Chapter13.Chapter13_20.QuadraticEquation;

public class Complex implements Cloneable, Comparable<Complex> {

    private double a;
    private double b;
    private double c;

    public Complex() {
         this.a = 0;
    }
    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(QuadraticEquation q) {
        this.a = q.getA();
        this.b = q.getB();
        this.c = q.getC();
    }

    public double getRealPartofRoot() {
        return -b / (2 * a);
    }
    public String getImaginaryPartofRoot() {
        return ((Math.sqrt(Math.abs(b * b - (4 * a * c)))) / 2 * a) + "i";
    }
    public Complex add(Complex c) {

        return new Complex(a + c.a, b + c.b);
    }
    public Complex subtract(Complex c) {

        return new Complex(a - c.a, b - c.b);
    }
    public Complex multiply(Complex c){

        return new Complex((a*c.a - b * c.b), (b*c.a + a * c.b));
    }
    public Complex divide(Complex c) {
        return new Complex(((a * c.a + b * c.b) / (c.a * c.a + c.b * c.b)), (b * c.a - a * c.b) / (c.a * c.a + c.b * c.b));
    }

    public Complex abs() {
        return new Complex(Math.sqrt(a * a + b * b));
    }
    public double getRealPart() {
        return a;
    }
    public String getImaginaryPart() {
        return b +"i";
    }

    @Override
    public String toString() {
        if (b == 0)
            return a + "";
        else
            return (a + " + " + b + "i");
    }

    @Override
    public Complex clone() {
        try {
            Complex clone = (Complex) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Complex o) {

        if (this.getRealPart() + this.getImaginaryPart().compareTo(o.getRealPart() + o.getImaginaryPart()) < 0) {
            return -1;
        } else if (this.getRealPart() + this.getImaginaryPart().compareTo(o.getRealPart() + o.getImaginaryPart()) > 0)
            return 1;
        else
            return 0;
    }
}
