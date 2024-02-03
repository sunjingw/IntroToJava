package Chapter5;

import java.util.Scanner;

public class Ex5_42 {
    public static void main(String[] args) {

        //Financial application - find the sales amount
        Scanner input = new Scanner(System.in);

        //Rewrite 5.39 using a for loop and let user enter commission instead of a constant

        System.out.println("Enter a commission goal: ");
        double commission = input.nextDouble();

        double comFormula = 0;
        double sales = 0;

        for (double i = 1000; comFormula < commission; i++) {
            comFormula = (5000 * 0.08) + (5000.01 * .10) + (i * 0.12);
            sales = i;
        }

        System.out.println("Sales target is " + (sales + 10000));


    }
}
