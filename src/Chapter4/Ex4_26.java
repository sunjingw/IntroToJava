package Chapter4;

import java.util.Scanner;

public class Ex4_26 {
    public static void main(String[] args) {

        //Financial application - monetary units
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount: ");
        String money = input.nextLine();

        int dollars = Integer.parseInt(money.substring(0, money.indexOf(".")));
        int cents = Integer.parseInt(money.substring(money.indexOf(".") + 1, money.length()));

        int quarters = cents / 25;
        int dimes = cents % 25 / 10;
        int nickels = cents % 25 % 10 / 5;
        int pennies = cents % 25 % 10 % 5 % 5;

        System.out.println("The amount " + money + " consists of:");
        System.out.println("\t" + dollars + " dollars");
        System.out.println("\t" + quarters + " quarters");
        System.out.println("\t" + dimes + " dimes");
        System.out.println("\t" + nickels + " nickels");
        System.out.println("\t" + pennies + " pennies");



    }
}
