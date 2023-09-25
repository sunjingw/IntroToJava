package Chapter4;

import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {

        //Phone key pads
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String letter = input.nextLine();
        char ch = letter.charAt(0);

        ch = Character.toUpperCase(ch);

        int num = 0;

        if (ch >= 'W') {
            num = 9;
        } else if (ch >= 'T') {
            num = 8;
        } else if (ch >= 'P') {
            num = 7;
        } else if (ch >= 'M') {
            num = 6;
        } else if (ch >= 'J') {
            num = 5;
        } else if (ch >= 'G') {
            num = 4;
        } else if (ch >= 'D') {
            num = 3;
        } else if (ch >= 'A') {
            num = 2;
        } else {
            System.out.println(ch + " is an invalid input");
            System.exit(1);
        }

        System.out.println("The corresponding number is " + num);
    }
}
