package Chapter13.Chapter13_5;

import java.util.*;

public class Rectangle extends GeometricObject {

    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
    @Override
    public int compareTo(GeometricObject o) {
        return getArea() < ((Rectangle)o).getArea() ? -1 : (getArea() == ((Rectangle)o).getArea() ? 0 : 1);
    }

    @Override
    public String toString() {
        return "Rectangle length = " + length + " width = " + width + " area = " + getArea();
    }
}
