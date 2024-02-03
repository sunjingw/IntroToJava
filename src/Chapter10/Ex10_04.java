package Chapter10;

import java.util.Scanner;

public class Ex10_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1, p2));
    }
}
