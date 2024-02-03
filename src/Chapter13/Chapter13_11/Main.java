package Chapter13.Chapter13_11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Octagon o1 = new Octagon(6);
        Octagon o2 = new Octagon(4);
        Octagon o3 = new Octagon(6);
        Octagon o4 = o1.clone();

        System.out.println(o1.getArea() + " " + o1.getPerimeter());
        System.out.println(o2.getArea() + " " + o2.getPerimeter());
        System.out.println(o3.getArea() + " " + o3.getPerimeter());
        System.out.println(o4.getArea() + " " + o4.getPerimeter());

        System.out.println("o1.compareTo(o2) = " + o1.compareTo(o2));
        System.out.println("o1.compareTo(o3) = " + o1.compareTo(o3));
        System.out.println("o2.compareTo(o3) = " + o2.compareTo(o3));
        System.out.println("o1.compareTo(o4) = " + o1.compareTo(o4));

        System.out.println(o1);
        System.out.println(o4);


    }
}
