package Chapter4;

import java.util.Scanner;

public class Ex4_13 {
    public static void main(String[] args) {

        //Vowel or consonant
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter: ");

        String letter = input.nextLine();

        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") ||
                letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") ||
                letter.equalsIgnoreCase("u")) {

            System.out.println(letter.charAt(0) + " is a vowel");

        } else if (((char)letter.charAt(0) >= 'a' && (char)letter.charAt(0) <='z') ||
                ((char)letter.charAt(0) >= 'A' && (char)letter.charAt(0) <= 'Z')) {

            System.out.println(letter.charAt(0) + " is a consonant");

        } else {
            System.out.println(letter.charAt(0) + " is an invalid input");
        }
    }
}
