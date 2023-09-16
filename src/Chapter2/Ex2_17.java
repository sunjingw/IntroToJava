package Chapter2;

import java.util.Scanner;

public class Ex2_17 {
    public static void main(String[] args) {

        //Science - wind chill temperature
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58F and 41F: ");

        double temp = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");

        double windSpeed = Math.pow(input.nextDouble(), 0.16);

        double windChill = 35.74 + 0.6215 * temp - 35.75 * windSpeed + 0.4275 * temp * windSpeed;

        System.out.println("The wind chill index is " + windChill);


    }
}
