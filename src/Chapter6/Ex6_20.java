package Chapter6;

import java.util.Scanner;

public class Ex6_20 {
    public static void main(String[] args) {

        //Count the letters in a string
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String s = input.nextLine();

        System.out.println("The number of letters in a string is " + countLetters(s));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count ++;
            }
        }

        return count;

    }
}
