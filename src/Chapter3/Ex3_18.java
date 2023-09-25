package Chapter3;

import java.util.Scanner;

public class Ex3_18 {
    public static void main(String[] args) {

        //Cost of shipping
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package in pounds: ");

        double weight = input.nextDouble();

        if (0 < weight && weight <= 1) {
            System.out.println("Cost $3.50");
        } else if (1 < weight && weight <= 3) {
            System.out.println("Cost $5.50");
        } else if (3 < weight && weight <= 10) {
            System.out.println("Cost $8.50");
        } else if (10 < weight && weight <= 20) {
            System.out.println("Cost $10.50");
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
