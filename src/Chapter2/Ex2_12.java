package Chapter2;

import java.util.Scanner;

public class Ex2_12 {
    public static void main(String[] args) {

        //Physics - finding runway length
        Scanner input = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");

        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + length);

    }
}
