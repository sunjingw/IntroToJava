package Chapter5;

import java.util.Scanner;

public class Ex5_30 {
    public static void main(String[] args) {

        //Financial application - compound value
        Scanner input = new Scanner(System.in);

        //Prompt user to enter an amount
        System.out.println("Enter an amount: ");
        double amount = input.nextDouble();
        double total = 0;
        double deposit = amount;

        //Prompt user for annual interest rate
        System.out.println("Enter an interest rate: ");
        double interest = input.nextDouble() / 1200;

        //Prompt user for number of months
        System.out.println("Enter number of months: ");
        int months = input.nextInt();

        //Display the amount in the savings account
        for (int i = 1; i <= months; i++) {

            amount = (deposit + total) * (1 + interest);

            total = amount;
        }

        System.out.println("Total value becomes $" + amount + " after " + months + " months");
    }
}
