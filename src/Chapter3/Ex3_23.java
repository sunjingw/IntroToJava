package Chapter3;

import java.util.Scanner;

public class Ex3_23 {
    public static void main(String[] args) {

        //Geometry - points in a rectangle
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");

        int x = input.nextInt();
        int y = input.nextInt();

        if ((x <= 5 && x >= -5) && (y <= 2.5 && y >= -2.5)) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
