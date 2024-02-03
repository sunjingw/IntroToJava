package Chapter13.Chapter13_5;

import java.util.*;

public abstract class GeometricObject implements Comparable<GeometricObject> {

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) > 0 ? o1 : o2;
    }

    public abstract String toString();
}
