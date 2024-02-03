package Chapter13.Chapter13_01;

import java.util.*;

public class Triangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        side1 = s1;
        side2 = s2;
        side3 = s3;

    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }


}
