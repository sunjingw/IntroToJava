package Chapter10;

import java.util.Scanner;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        /*
        double s = (p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY())) / 2;

        double area = Math.sqrt(s * (s - p1.getX() * (p2.getY() - p3.getY())) *
                (s - p2.getX() * (p3.getY() - p1.getY())) *
                (s - p3.getX() * (p1.getY() - p2.getY())));

        return area;
        */
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2;

        return Math.pow(s * (s - s1) * (s - s2) * (s - s3), 0.5);

    }
    public double getPerimeter() {
        double ab = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        double ac = Math.sqrt(Math.pow(p1.getX() - p3.getX(), 2) + Math.pow(p1.getY() - p3.getY(), 2));;
        double bc = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));;

        return ab + ac + bc;
    }

    public double getS(MyPoint p) {
         return 1/(2*getArea()) * (p1.getY() * p3.getX() - p1.getX() * p3.getY() + (p3.getY() - p1.getY()) * p.getX() + (p1.getX() - p3.getX()) * p.getY());
    }

    public double getT(MyPoint p) {
        return 1/(2*getArea()) * (p1.getX() * p2.getY() - p1.getY() * p2.getX() + (p1.getY() - p2.getY()) * p.getX() + (p2.getX() - p1.getX()) * p.getY());
    }

    public boolean contains(MyPoint p) {

        if (0 <= getS(p) && getS(p) <= 1 && 0 <= getT(p) && getT(p) <= 1 && (getS(p) + getT(p) <= 1)){
            return true;
        }
        return false;
    }

    public boolean contains(Triangle2D t) {
        if (contains(t.getP1()) && contains(t.getP2()) && contains(t.getP3())) {
            return true;
        } else
            return false;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
