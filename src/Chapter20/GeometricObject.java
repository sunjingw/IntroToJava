package Chapter20;

public abstract class GeometricObject {

    double radius;
    double length;
    double width;

    public GeometricObject(double radius) {
        this.radius = radius;
    }
    public GeometricObject(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract double getArea();
}
