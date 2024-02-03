package Chapter13.Chapter13_10;


public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public int compareTo(Rectangle o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return getArea() == ((Rectangle)o).getArea();
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
