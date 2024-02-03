package Chapter5;

import java.util.Scanner;

public class Ex5_31 {
    public static void main(String[] args) {

        //Financial application - compute CD value
        Scanner input = new Scanner(System.in);

        System.out.println("Enter initial deposit amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual percentage yield: ");
        double interest = input.nextDouble();

        System.out.println("Enter maturity period (number of months): ");
        int months = input.nextInt();

        System.out.println("Month\tCD Value");
        for (int i = 1; i <= months; i++) {
            amount = amount + (amount * interest / 1200);
            System.out.println(i + "\t\t" + amount);
        }
    }
}
