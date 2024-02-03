package Chapter20;

import javafx.geometry.Point2D;

import java.util.*;

public class Ex20_04 {
    public static void main(String[] args) {

        List<Point2D> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Point2D x = new Point2D(new Random().nextDouble()*100, new Random().nextDouble()*100);

            list.add(x);
        }

        for (Point2D e : list) {
            System.out.println(e);
        }

        System.out.println("---------------");

        Collections.sort(list, Comparator.comparing(Point2D::getY).thenComparing(Point2D::getX));
        for (Point2D e : list) {
            System.out.println(e);
        }
    }
}
