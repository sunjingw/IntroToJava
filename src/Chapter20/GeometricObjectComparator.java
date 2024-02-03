package Chapter20;

import java.util.*;

public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {

    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        return (area1 < area2) ? -1 : ((area1 > area2) ? 1 : 0);
    }
}
