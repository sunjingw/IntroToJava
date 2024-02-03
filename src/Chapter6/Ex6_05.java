package Chapter6;

import java.util.Scanner;

public class Ex6_05 {
    public static void main(String[] args) {

        //Sort three numbers
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double temp = 0;

        if (num3 < num1) {

            temp = num3;
            num3 = num1;
            num1 = temp;

        } else if (num2 < num1 ) {

            temp = num2;
            num2 = num1;
            num1 = temp;

        } else if (num3 < num2) {

            temp = num3;
            num3 = num2;
            num2 = temp;
        }

        if (num1 < num2 && num2 < num3)
            System.out.println(num1 + " " + num2 + " " + num3);
        else
            displaySortedNumbers(num1, num2, num3);
    }
}
