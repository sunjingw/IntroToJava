package Chapter2;

import java.util.Scanner;

public class Ex2_09 {
    public static void main(String[] args) {

        //Physics - acceleration
        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0, v1, and t: ");

        //Starting velocity v0 in meters/second
        double v0 = input.nextDouble();

        //Ending velocity v1 in meters/second
        double v1 = input.nextDouble();

        //Time span t in seconds
        double time = input.nextDouble();

        double avgAcceleration = (v1 - v0) / time;

        System.out.println("The average acceleration is " + avgAcceleration);

    }
}
