package Chapter18;

import java.util.*;

public class Ex18_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        reverseDisplay("abcd");
    }

    public static void reverseDisplay(String s) {

        if (s.length() == 0) {
            return;
        } else {
            int n = s.length() - 1;

            System.out.print(s.charAt(n));
            reverseDisplay(s.substring(0, n));
        }
    }
}
