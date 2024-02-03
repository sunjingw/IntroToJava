package Chapter5;

import java.util.Scanner;

public class Ex5_49 {
    public static void main(String[] args) {

        //Count vowels and consonants
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        int vowels = 0;
        int space = 0;

        String letter = "";

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i) + "";

            if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")) {

                vowels++;
            } else if (letter.equalsIgnoreCase(" ")) {
                space++;
            }
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + (s.length() - vowels - space));
    }
}
