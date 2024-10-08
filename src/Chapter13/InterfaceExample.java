package Chapter13;

import java.util.*;

public class InterfaceExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);

        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);

        ((Circle) circle).getRadius();


    }
}

interface MutableShape extends Movable, Scalable{


        }
interface Movable {

    void move(float dx, float dy);
}

interface Scalable {

    void scale(float factor);
}

final class Circle implements MutableShape, Movable, Scalable{

    /**
     * Defines the horizontal position of the center of the circle
     */
    private float centerX;

    /**
     * Defines the vertical position of the center of the circle
     */
    private float centerY;

    /**
     * Defines the radius of the circle
     */
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void move(float dx, float dy) {
        this.centerX = centerX + dx;
        this.centerY = centerY + dy;
    }

    @Override
    public void scale(float factor) {

        this.radius = radius * factor;
    }
}

final class Rectangle implements MutableShape, Movable, Scalable{

    /**
     * Defines the X coordinate of the upper-left corner of the rectangle.
     */
    private float x;

    /**
     * Defines the Y coordinate of the upper-left corner of the rectangle.
     */
    private float y;

    /**
     * Defines the width of the rectangle.
     */
    private float width;

    /**
     * Defines the height of the rectangle.
     */
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public void move(float dx, float dy) {
        this.x = x + dx;
        this.y = y + dy;
    }

    @Override
    public void scale(float factor) {
        this.width = width * factor;
        this.height = height * factor;
    }
}
