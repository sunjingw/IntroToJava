package Chapter18;

import java.util.*;

public class Ex18_25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        displayPermutation(input.nextLine());
    }

    public static void displayPermutation(String s) {
         displayPermutation(" ", s);
    }

    public static void displayPermutation(String s1, String s2) {
        if (s2.length() > 0) {
            for (int i = 0; i < s2.length(); i++) {
                String shuffle1 = s1 + s2.charAt(i);
                String shuffle2 = s2.substring(0, i) + s2.substring(i + 1);
                displayPermutation(shuffle1, shuffle2);
            }
        } else {
            System.out.println(s1);
        }
    }
}
