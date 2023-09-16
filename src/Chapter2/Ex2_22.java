package Chapter2;

import java.util.Scanner;

public class Ex2_22 {
    public static void main(String[] args) {

        //Financial application - monetary units
        //Program that breaks a large amount of money into smaller units

        Scanner input = new Scanner(System.in);

        //Prompt user to enter an amount
        System.out.println("Enter an amount: ");
        int money = input.nextInt();

        int dollars = money / 100;

        int cents = money % 100;

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
