package Chapter2;

import java.util.Scanner;

public class Ex2_23 {
    public static void main(String[] args) {

        //Cost of driving
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");

        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon: ");

        double mpg = input.nextDouble();

        System.out.println("Enter price per gallon: ");

        double ppg = input.nextDouble();

        double cost = distance / mpg * ppg;

        System.out.println("The cost of driving is $" + (int)(cost * 100) / 100.0);
    }
}
