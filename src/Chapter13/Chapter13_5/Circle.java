package Chapter13.Chapter13_5;

import java.util.*;

public class Circle extends GeometricObject {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return getArea() < ((Circle)o).getArea() ? -1 : (getArea() == ((Circle)o).getArea() ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Circle radius = " + radius + " area = " + getArea();
    }
}
