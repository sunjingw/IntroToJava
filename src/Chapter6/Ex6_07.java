package Chapter6;

import java.util.Scanner;

public class Ex6_07 {
    public static void main(String[] args) {

        //Financial application - compute the future investment value
        Scanner input = new Scanner(System.in);

        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double interest = input.nextDouble();

        int years = 30;

        System.out.printf("Years\tFuture Value\n");

        futureInvestmentValue(investmentAmount, interest/100, years);


    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterest, int years) {

        for (int i = 1; i <= years; i++) {

            for (int j = 1; j <= 12; j++) {

                investmentAmount = investmentAmount * (1 + monthlyInterest / 12);

            }

            System.out.printf("%d\t\t\t%2.2f", i, (investmentAmount));

            System.out.println();
        }



        return 0;
    }
}
