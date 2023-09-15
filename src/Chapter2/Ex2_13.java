package Chapter2;

import java.util.Scanner;

public class Ex2_13 {
    public static void main(String[] args) {

        //Financial application: compound value
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");

        double amount = input.nextDouble();

        double interest = 1.00417;

        //First month
        double total = amount * interest;

        //Second month
        total += amount;
        total *= interest;

        //Third month
        total += amount;
        total *= interest;

        //Fourth month
        total += amount;
        total *= interest;

        //Fifth month
        total += amount;
        total *= interest;

        //Sixth month
        total += amount;
        total *= interest;


        System.out.println("After the sixth month, the account value is: " + total);



    }
}
