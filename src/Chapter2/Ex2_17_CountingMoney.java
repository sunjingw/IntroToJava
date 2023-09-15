package Chapter2;

import java.util.Scanner;

public class Ex2_17_CountingMoney {
    public static void main(String[] args) {
        //Program that breaks a large amount of money into smaller units

        Scanner input = new Scanner(System.in);

        //Prompt user to enter an amount
        System.out.println("Enter an amount: ");
        double money = input.nextDouble();

        //Convert amount into an integer
        double totalCents = money * 100;

        //Find the amount of dollars by concatenating the decimals
        int dollars = (int)money;

        //Find the decimal amount and convert into  integer
        int cents = (int)totalCents % 100;

        //Find the amount of quarters as a whole number
        int quarters = cents / 25;

        //Find the amount of dimes after quarters have been calculated
        int dimes = (cents % 25) / 10;

        //Find the amount of nickels after accounting for quarters and dimes
        int nickels = ((cents % 25) % 10) / 5;

        //Find the remaining pennies
        int cent = (((cents % 25) % 10) % 5);

        System.out.println("Broken down: ");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(cent + " pennies");



    }
}
