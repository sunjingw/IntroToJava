package Chapter13.Chapter13_07;

import java.util.*;

public abstract class GeometricObject implements Colorable{

    private String color;
    private boolean filled;

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

}
