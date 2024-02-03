package Chapter10;

import java.util.Scanner;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
       this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    public boolean contains(double x, double y) {

        if (Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) > this.radius) {
            return false;
        }

        return true;
    }
    public boolean contains(Circle2D circle) {

        return (Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= Math.abs(radius - circle.getRadius()));

    }
    public boolean overlaps (Circle2D circle) {

        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
    }
}
