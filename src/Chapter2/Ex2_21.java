package Chapter2;

import java.util.Scanner;

public class Ex2_21 {
    public static void main(String[] args) {

        //Financial application - calculate future investment value
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");

        double investment = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");

        double interest = input.nextDouble();

        System.out.println("Enter number of years: ");

        int years = input.nextInt();


        double accValue = investment * Math.pow((1 + interest / 100.0), years);

        System.out.println("Accumulated value is " + accValue);



    }
}
