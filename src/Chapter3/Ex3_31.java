package Chapter3;

import java.util.Scanner;

public class Ex3_31 {
    public static void main(String[] args) {

        //Financial - currency exchange
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB: ");

        double rate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");

        int convert = input.nextInt();

        if (convert != 0 && convert != 1) {
            System.out.println("Incorrect input");
            System.exit(1);
        } else {

            System.out.println("Enter the dollar amount");

            double amount = input.nextDouble();

            if (convert == 0) {
                System.out.print(amount + " dollars is ");
                amount *= rate;
                System.out.println(amount + " yuan");
            } else {
                System.out.print(amount + " yuan is ");
                amount /= rate;
                amount = (int) (amount * 100) / 100.0;

                System.out.println(amount + " dollars");
            }
        }

    }
}
