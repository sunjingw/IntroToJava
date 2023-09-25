package Chapter4;

import java.util.Scanner;

public class Ex4_11 {
    public static void main(String[] args) {

        //Decimal to hex
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal value 0 to 15: ");

        int num = input.nextInt();

        if (num < 10) {
            System.out.println("The hex value is " + num);
        } else if (num >= 11 && num <= 15) {
            System.out.println("The hex value is " + (char)(55 + num));
        } else {
            System.out.println(num + " is an invalid input");
        }
    }
}
