package Chapter13.Chapter13_11;

import java.util.*;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{

    private double side;

    public Octagon() {
        this(0);
    }
    public Octagon(double side) {
        this.side = side;
    }
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }
    public double getPerimeter() {
        return side * 8;
    }
    @Override
    public int compareTo(Octagon o) {
        return this.getArea() < o.getArea() ? -1 : (this.getArea() == o.getArea() ? 0 : 1);
    }
    @Override
    public Octagon clone() {
        try {
            Octagon clone = (Octagon) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
