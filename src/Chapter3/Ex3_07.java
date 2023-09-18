package Chapter3;

import java.util.Scanner;

public class Ex3_07 {
    public static void main(String[] args) {

        //Financial appliation - monetary units
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount: ");

        double amount = input.nextDouble();

        int dollars = (int)amount;

        int quarters = (int)(amount * 100 % 100 / 25);

        int dimes = (int)(amount * 100 % 100 % 25 / 10);

        int nickels = (int)(amount * 100 % 100 % 25 % 10 / 5);

        int pennies = (int)(amount * 100 % 100 % 25 % 10 % 5);

        if (dollars > 1) {
            System.out.println(dollars + " dollars");
        } else if (dollars == 1) {
            System.out.println(dollars + " dollar");
        }

        if (quarters > 1) {
            System.out.println(quarters + " quarters");
        } else if (quarters == 1) {
            System.out.println(quarters + " quarter");
        }

        if (dimes > 1) {
            System.out.println(dimes + " dimes");
        } else if (dimes == 1) {
            System.out.println(dimes + " dime");
        }

        if (nickels > 1) {
            System.out.println(nickels + " nickels");
        } else if (nickels == 1) {
            System.out.println(nickels + " nickel");
        }

        if (pennies > 1) {
            System.out.println(pennies + " pennies");
        } else if (pennies == 1) {
            System.out.println(pennies + " penny");
        }

    }
}
