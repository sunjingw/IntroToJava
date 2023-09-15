package Chapter2;

import java.util.Scanner;

public class Ex2_06 {
    public static void main(String[] args) {

        //Sum the digits in an integer
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int num1 = num % 10;
        int num2 = (num / 10) % 10;
        int num3 = (num / 100);

        System.out.println("The sum of the digits is : " + (num1 + num2 + num3));

    }
}
