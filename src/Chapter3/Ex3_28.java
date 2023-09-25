package Chapter3;

import java.util.Scanner;

public class Ex3_28 {
    public static void main(String[] args) {

        //Geometry - two rectangles
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x, y coordinates, width, and height: ");

        double r1x = input.nextDouble();
        double r1y = input.nextDouble();

        double r1w = input.nextDouble();
        double r1h = input.nextDouble();

        System.out.println("Enter r2's center x, y coordinates, width, height: ");

        double r2x = input.nextDouble();
        double r2y = input.nextDouble();

        double r2w = input.nextDouble();
        double r2h = input.nextDouble();

        if	((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2h / 2 <= r1h / 2) &&
                (Math.pow(Math.pow(r2x - r1x, 2), .05) + r2w / 2 <= r1w / 2) &&
                (r1h / 2 + r2h / 2 <= r1h) &&
                (r1w / 2 + r2w / 2 <= r1w))
            System.out.println("r2 is inside r1");
        else if ((r1x + r1w / 2 > r2x - r2w) ||
                (r1y + r1h / 2 > r2y - r2h))
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlap r1");
    }
}
