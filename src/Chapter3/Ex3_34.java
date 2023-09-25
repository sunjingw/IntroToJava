package Chapter3;

import java.util.Scanner;

public class Ex3_34 {
    public static void main(String[] args) {

        //Geometry - point on line segment
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points for p0, p1, p2: ");

        double p0x = input.nextDouble();
        double p0y = input.nextDouble();

        double p1x = input.nextDouble();
        double p1y = input.nextDouble();

        double p2x = input.nextDouble();
        double p2y = input.nextDouble();

        double calc = (p1x - p0x) * (p2y - p0y) - (p2x - p0x) * (p1y - p0y);

        if (calc == 0 && (p2x <= p0x + p1x) && (p2y <= p0y + p1y)) {
            System.out.println("(" + p2x + ", " + p2y + ") is on the line from (" + p0x + ", " + p0y
                    + ") to (" + p1x + ", " + p1y + ")");
        } else
            System.out.println("(" + p2x + ", " + p2y + ") is not on the line from (" + p0x + ", " + p0y
                    + ") to (" + p1x + ", " + p1y + ")");
        }

}
