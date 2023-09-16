package Chapter2;

import java.util.Scanner;

public class Ex2_14 {
    public static void main(String[] args) {

        //Health applicationL computing BMI
        Scanner input = new Scanner(System.in);

        final double KILOGRAM = 0.45359237;
        final double METER = 0.0254;

        System.out.println("Enter weight in pounds: ");

        double weight = input.nextDouble() * KILOGRAM;

        System.out.println("Enter height in inches: ");

        double height = input.nextDouble() * METER;

        double bmi = weight / (Math.pow(height, 2));

        System.out.println("BMI is " + bmi);
    }
}
