package Chapter3;

import java.util.Scanner;

public class Ex3_09 {
    public static void main(String[] args) {

        //Business - check ISBN-10
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");

        int isbn = input.nextInt();

        int isbn0 = isbn / 100000000 % 10;
        int isbn1 = isbn / 10000000 % 10;
        int isbn2 = isbn / 1000000 % 10;
        int isbn3 = isbn / 100000 % 10;
        int isbn4 = isbn / 10000 % 10;
        int isbn5 = isbn / 1000 % 10;
        int isbn6 = isbn / 100 % 10;
        int isbn7 = isbn / 10 % 10;
        int isbn8 = isbn % 10;

        int isbn10 = (isbn0 + isbn1 * 2 + isbn2 * 3 + isbn3 * 4 + isbn4 * 5 + isbn5 * 6 + isbn6 * 7 + isbn7 * 8 +
                isbn8 * 9) % 11;

        if (isbn10 == 10) {
            System.out.println("" + isbn0 + isbn1 + isbn2 + isbn3 +isbn4 + isbn5 + isbn6 + isbn7 + isbn8 + "X");
        } else {
            System.out.println("" + isbn0 + isbn1 + isbn2 + isbn3 +isbn4 + isbn5 + isbn6 + isbn7 + isbn8 + isbn10);
        }
    }
}
