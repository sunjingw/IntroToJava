package Chapter13.Chapter13_12;

import java.util.*;

public abstract class GeometricObject {

    public abstract double getArea();
    public static double sumArea(GeometricObject[] a) {

        double total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i].getArea();
        }

        return total;
    }
}
