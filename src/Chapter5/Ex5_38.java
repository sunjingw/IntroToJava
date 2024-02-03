package Chapter5;

import java.util.Scanner;

public class Ex5_38 {
    public static void main(String[] args) {

        //Decimal to octal
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        String octal = "";

        while (num != 0) {

            octal = num % 8 + octal;

            num = num / 8;
        }

        System.out.println(octal);
    }
}
