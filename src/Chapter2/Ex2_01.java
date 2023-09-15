package Chapter2;

import java.util.Scanner;

public class Ex2_01 {
    public static void main(String[] args) {

        //Convert celsius to fahrenheit
        Scanner input = new Scanner(System.in);

        //Read a double value from the console
        System.out.println("Enter a degree in celsius: ");
        double celsius = input.nextDouble();

        double f = (9.0/5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + f + " Fahrenheit");

    }
}
