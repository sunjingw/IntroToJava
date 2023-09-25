package Chapter4;

import java.util.Scanner;

public class Ex4_19 {
    public static void main(String[] args) {

        //Business - check ISBN-10
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN: ");

        String isbn = input.nextLine();
        int lastDigit = (Integer.parseInt(isbn.charAt(0)+"") * 1 + Integer.parseInt(isbn.charAt(1)+"") * 2 +
                Integer.parseInt(isbn.charAt(2)+"") * 3 + Integer.parseInt(isbn.charAt(3)+"") * 4 +
                Integer.parseInt(isbn.charAt(4)+"") * 5 + Integer.parseInt(isbn.charAt(5)+"") * 6 +
                Integer.parseInt(isbn.charAt(6)+"") * 7 + Integer.parseInt(isbn.charAt(7)+"") * 8 +
                Integer.parseInt(isbn.charAt(8)+"") * 9) % 11;

        if (lastDigit == 10) {
            System.out.println("The ISBN-10 number is " + isbn + "X");
        } else {
            System.out.println("The ISBN-10 number is " + isbn + lastDigit);
        }
    }
}
