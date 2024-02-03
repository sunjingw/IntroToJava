package Chapter13.Chapter13_06;

import java.util.*;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() < o.getArea())
            return -1;
        else if (this.getArea() == o.getArea())
            return 0;
        else
            return 1;
    }

    public double max(ComparableCircle o) {
        if (this.compareTo(o) < 0)
            return o.getArea();
        else if (this.compareTo(o) == 0)
            return this.getArea();
        else
            return this.getArea();
    }
}
