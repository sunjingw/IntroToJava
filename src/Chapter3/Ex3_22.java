package Chapter3;

import java.util.Scanner;

public class Ex3_22 {
    public static void main(String[] args) {

        //Geometry - point in a circle?
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");

        int x = input.nextInt();
        int y = input.nextInt();

        double distance = Math.pow(Math.pow((x - 0), 2) + (Math.pow((y - 0), 2)), 0.5);

        if (distance <= 10) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }
    }
}
