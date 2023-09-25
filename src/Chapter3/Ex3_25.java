package Chapter3;

import java.util.Scanner;

public class Ex3_25 {
    public static void main(String[] args) {

        //Geometry - intersecting point
        Scanner input = new Scanner(System.in);

        System.out.println("Enter (x1, y1), (x2, y2), (x3, y3), (x4, y4): ");

        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();

        int x4 = input.nextInt();
        int y4 = input.nextInt();

        double a = y1 - y2;
        double b = -1 * (x1 - x2);

        double e = (y1 - y2) * x1 - (x1 - x2) * y1;

        double c = y3 - y4;
        double d = -1 * (x3 - x4);

        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        if (a * d - b * c != 0) {
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        } else {
            System.out.println("The two lines are parallel");
        }
    }
}
