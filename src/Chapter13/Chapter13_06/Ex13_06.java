package Chapter13.Chapter13_06;

import java.util.*;

public class Ex13_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle c1 = new ComparableCircle(5);
        Circle c2 = new ComparableCircle(5.1);

        System.out.println("c1 = " + c1.getArea());
        System.out.println("c2 = " + c2.getArea());

        System.out.println(((ComparableCircle)c1).max((ComparableCircle)c2));

    }
}
