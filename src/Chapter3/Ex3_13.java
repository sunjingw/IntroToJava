package Chapter3;

import java.util.Scanner;

public class Ex3_13 {
    public static void main(String[] args) {
        /**
         * INCOMPLETE
         */


        //Financial application - compute taxes
        Scanner input = new Scanner(System.in);

        System.out.println("Enter status for tax filing: ");
        System.out.println("0 - single filter");
        System.out.println("1 - married jointly or qualifying widow(er)");
        System.out.println("2 - married separately");
        System.out.println("3 - head of household");

        int status = input.nextInt();

        System.out.println("Enter taxable income: ");
        double income = input.nextDouble();


    }
}
