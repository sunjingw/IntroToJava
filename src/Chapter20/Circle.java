package Chapter20;

public class Circle extends GeometricObject {
    public Circle(double radius) {
        super(radius);
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
