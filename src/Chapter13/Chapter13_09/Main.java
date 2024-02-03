package Chapter13.Chapter13_09;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(5);

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.equals(c3) = " + c1.equals(c3));
        System.out.println("c2.equals(c3) = " + c2.equals(c3));
    }
}
