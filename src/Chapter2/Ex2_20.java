package Chapter2;

import java.util.Scanner;

public class Ex2_20 {
    public static void main(String[] args) {

        //Financial application - calculate interest
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g. 3 for 3%): ");

        double balance = input.nextDouble();
        double interest = input.nextDouble() / 100.0 / 12;

        double monthlyInterest = balance * interest;

        System.out.println("The interest is " + monthlyInterest);

    }
}
