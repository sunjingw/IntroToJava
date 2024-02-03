package Chapter13.Chapter13_05;

import java.util.*;

public abstract class GeometricObject implements Comparable<GeometricObject>{

    @Override
    public int compareTo(GeometricObject o) {
        return this.getArea() < o.getArea() ? -1 : (this.getArea() == o.getArea() ? 0 : 1);
    }

    public abstract double getArea();

    public abstract double getPerimeter();
    public static double max(GeometricObject ob1, GeometricObject ob2) {

        if (ob1.compareTo(ob2) < 0)
            return ob2.getArea();
        else if (ob1.equals(ob2))
            return ob1.getArea();
        else
            return ob1.getArea();

    }

}
