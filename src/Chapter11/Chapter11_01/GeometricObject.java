package Chapter11.Chapter11_01;

import java.util.Scanner;

public class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        this("blue", true);
    }
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public boolean getFilled() {
        return filled;
    }

}
