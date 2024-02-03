package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_34 {
    public static void main(String[] args) {

        //Sort characters in a string
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a string to sort: ");
        String s = input.nextLine();

        System.out.println(sort(s));

    }

    public static String sort(String s) {

        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < chars.length; i++) {

            char min = chars[i];
            int index = i;

            for (int j = i; j < chars.length; j++) {

                if (chars[j] < min) {
                    min = chars[j];
                    index = j;
                }
            }

            if (index != i) {
                chars[index] = chars[i];
                chars[i] = min;
            }
        }

        s = "";

        for (char e : chars) {
            s += e + "";
        }

        return s;
    }
}
