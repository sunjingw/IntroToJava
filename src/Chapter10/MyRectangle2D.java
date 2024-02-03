package Chapter10;

import java.util.Scanner;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }
    public boolean contains(double x, double y) {
        return (x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height);
    }
    public boolean contains(MyRectangle2D r) {
        return true;
    }
}
