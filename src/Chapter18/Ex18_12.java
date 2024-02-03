package Chapter18;

import java.util.*;

public class Ex18_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        reverseDisplay(s);
    }
    public static void reverseDisplay(String s) {
        reverseDisplay(s, s.length() - 1);
    }
    public static void reverseDisplay(String s, int high) {

        if (high < 0) {
            return;
        } else {
            System.out.print(s.charAt(high));
            reverseDisplay(s, high - 1);
        }

    }
}
