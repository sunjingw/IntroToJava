package Chapter3;

import java.util.Scanner;

public class Ex3_20 {
    public static void main(String[] args) {

        //Science - wind chill temperature
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit between -58F and 41F: ");

        double temp = input.nextDouble();

        System.out.println("Enter wind speed (>=2) in miles per hour: ");

        double wind = input.nextDouble();


        double windChill = 35.74 + (0.6215 * temp) - (35.75 * (Math.pow(wind, 0.16))) + (0.4275 * temp * (Math.pow(wind, 0.16)));

        if ((-58 < temp && temp < 41) && wind >= 2) {
            System.out.println("The wind chill index is " + windChill);
        } else {
            System.out.println("The input is invalid");
        }


    }
}
