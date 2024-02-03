package Chapter13.Chapter13_20;

import java.util.*;
import Chapter13.Chapter13_17.Complex;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double root1;
    double root2;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int discriminant() {
        double dis = Math.pow(b, 2) - (4 * a * c);

        if (dis > 0) {
             root1 = (-b + Math.pow(dis, 0.5)) / (2 * a);
             root2 = (-b - Math.pow(dis, 0.5)) / (2 * a);
             return 2;
        } else if (dis == 0) {
             root1 = (-b + Math.pow(dis, 0.5)) / (2 * a);
             return 1;
        }

        return 0;
    }

    public Complex imaginaryRoots(QuadraticEquation qe) {
       Complex r1 = new Complex(qe);

       return r1;
    }

}
