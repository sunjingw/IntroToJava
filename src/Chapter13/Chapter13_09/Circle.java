package Chapter13.Chapter13_09;


public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public int compareTo(Circle o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (getRadius() == ((Circle)o).getRadius())
            return true;
        else
            return false;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
