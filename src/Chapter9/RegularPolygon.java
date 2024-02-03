package Chapter9;

import java.util.Scanner;

public class RegularPolygon {

    private int side =3;
    private double length = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int side, double length) {
        this.side = side;
        this.length = length;
    }

    public RegularPolygon(int side, double length, double x, double y) {
        this.side = side;
        this.length = length;
        this.x = x;
        this.y = y;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter() {
        return side * length;
    }
    public double getArea() {
        return (side * length * length) / (4 * Math.tan(Math.PI/side));
    }


}
