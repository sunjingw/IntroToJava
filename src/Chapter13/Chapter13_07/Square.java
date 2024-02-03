package Chapter13.Chapter13_07;

import java.util.*;

public class Square extends GeometricObject implements Colorable {
    private double side;

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public void howToColor() {
        if (!this.isFilled())
            System.out.println("Color all four sides");
    }
    @Override
    public double getArea() {
        return side * side;
    }
}
