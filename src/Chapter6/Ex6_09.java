package Chapter6;

import java.util.Scanner;

public class Ex6_09 {
    public static void main(String[] args) {

        //Conversion between feet and meters
        Scanner input = new Scanner(System.in);

        System.out.println("Feet\t\tMeters\t\t\t|\t\t\tMeters\t\tFeet");
        System.out.println("----------------------------|---------------------------");

        for (double i = 1, j = 20; i <= 10 && j <= 65; i++, j+=5){

            System.out.printf("%1.1f\t\t\t%1.3f\t\t\t|\t\t%2.1f\t\t\t%2.3f\n", i, footToMeters(i), j, meterToFoot(j));
        }
    }

    public static double footToMeters(double foot) {

        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {

        return 3.279 * meter;
    }
}
