package Chapter5;

import java.util.Scanner;

public class Ex5_21 {
    public static void main(String[] args) {

        //Financial application - compare loans with various interest rate
        Scanner input = new Scanner(System.in);

        //Enter loan amount
        System.out.println("Enter loan amount: ");
        double loan = input.nextDouble();

        //Enter loan period in number of years
        System.out.println("Enter number of years: ");
        int years = input.nextInt();

        double monthlyInterest;
        double monthlyPayment;

        //Display monthly and total payments for each interest rate from 5% to 8% with increment of 1/8
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");

        for (double interest = 5; interest <= 8; interest += 0.125) {

            monthlyInterest = interest / 1200;
            monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));

            System.out.printf("%5.3f%s\t\t\t%5.2f\t\t\t%8.2f\n", interest, "%", monthlyPayment, (monthlyPayment * years * 12));


        }
    }
}
