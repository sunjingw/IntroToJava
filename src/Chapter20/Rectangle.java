package Chapter20;

import java.util.*;

public class Rectangle extends GeometricObject {

    public Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
