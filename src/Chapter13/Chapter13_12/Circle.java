package Chapter13.Chapter13_12;

import java.util.*;

public class Circle extends GeometricObject {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
