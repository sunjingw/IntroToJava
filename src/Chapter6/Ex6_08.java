package Chapter6;

import java.util.Scanner;

public class Ex6_08 {
    public static void main(String[] args) {

        //Conversions between Celsius and Fahrenheit
        Scanner input = new Scanner(System.in);

        System.out.println("Celsius\t\tFahrenheit\t\t\t|\t\t\tFahrenheit\t\tCelsius");
        System.out.println("--------------------------------|---------------------------");

        for (double i = 40, j = 120; i > 30 && j >= 30; i--, j-=10){

            System.out.printf("%2.1f\t\t%2.1f\t\t\t\t|\t\t\t%2.1f\t\t\t%2.2f\n", i, celsiusToFahrenheit(i), j, fahrenheitToCelsius(j));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {

        return (9.0 / 5) * celsius + 32;

    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        return (5.0 / 9) * (fahrenheit - 32);

    }
}
