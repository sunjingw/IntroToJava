package Chapter3;

import java.util.Scanner;

public class Ex3_06 {
    public static void main(String[] args) {

        //Health application - BMI
        Scanner input = new Scanner(System.in);

        final double KILOGRAM = 0.453592;
        final double METERS = 0.0254;

        System.out.println("Enter weight in pounds: ");

        double weight = input.nextDouble();

        System.out.println("Enter feet: ");

        int feet = input.nextInt();

        System.out.println("Enter inches: ");

        int inches = input.nextInt();

        double bmi = (weight * KILOGRAM) / ((feet * 12 + inches) * METERS * (feet * 12 + inches) * METERS);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");

        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
