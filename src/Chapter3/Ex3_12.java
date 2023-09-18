package Chapter3;

import java.util.Scanner;

public class Ex3_12 {
    public static void main(String[] args) {

        //Palindrome
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit number: ");

        int num = input.nextInt();

        int num1 = num / 100;
        int num2 = num / 10 % 10;
        int num3 = num % 10;

        if (num1 == num3) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
