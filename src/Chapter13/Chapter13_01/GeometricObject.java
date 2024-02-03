package Chapter13.Chapter13_01;

public abstract class GeometricObject {

    private boolean filled;
    private String color;

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

    public abstract double getPerimeter();

    public String toString() {
        return "Color: " + getColor() + "\nFilled: " + isFilled();
    }

}
