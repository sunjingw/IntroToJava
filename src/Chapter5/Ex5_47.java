package Chapter5;

import java.util.Scanner;

public class Ex5_47 {
    public static void main(String[] args) {

        //Business - check ISBN-13
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 12 digits of an ISBN-13: ");
        String isbn = input.nextLine();

        int checksum = -1;
        int num = 0;

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
            System.exit(1);
        } else {
            for (int i = 0; i < 12; i++) {
                 if (i % 2 == 0) {
                     num += Integer.parseInt(isbn.charAt(i) + "");
                 } else
                     num += 3 * Integer.parseInt(isbn.charAt(i) + "");

            }

            checksum = 10 - num % 10;

        }

        if (checksum == 10) {
            System.out.println("The ISBN-13 number is " + isbn + "0");
        } else
            System.out.println("The ISBN-13 number is " + isbn + checksum);

    }
}
