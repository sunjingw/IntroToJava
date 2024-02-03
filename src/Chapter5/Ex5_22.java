package Chapter5;

import java.util.Scanner;

public class Ex5_22 {
    public static void main(String[] args) {

        //Financial application - loan amortization schedule
        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan amount: ");
        double loan = input.nextDouble();

        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        System.out.println("Enter annual interest rate: ");
        double interestRate = input.nextDouble();

        double monthlyInterest = interestRate / 1200;
        double monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));

        System.out.printf("Monthly payment: %5.2f\n", monthlyPayment);
        System.out.printf("Total payment: %5.2f\n", (monthlyPayment * years * 12));

        System.out.println();
        //Display payment table
        System.out.println("Payment #\t Interest\t Principal\t Balance");
        double interest, principal;
        double balance = loan;

        double totalInterest = 0;
        double totalPrincipal = 0;

        for (int i = 1; i <= years * 12; i++) {
            interest = monthlyInterest * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;

            totalInterest += interest;
            totalPrincipal += principal;

            System.out.printf("%d\t\t\t %2.2f\t\t %2.2f\t\t %4.2f\n", i, interest, principal, balance);

        }

        System.out.println("Total interest: " + totalInterest);

    }
}
