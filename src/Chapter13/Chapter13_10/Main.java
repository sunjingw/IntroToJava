package Chapter13.Chapter13_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(25,2);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println("r1.equals(r2) = " + r1.equals(r2));
        System.out.println("r1.equals(r3) = " + r1.equals(r3));
        System.out.println("r2.equals(r3) = " + r2.equals(r3));
    }
}
