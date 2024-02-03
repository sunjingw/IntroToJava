package Chapter18;

import java.util.*;

public class Ex18_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] chars = new char[5];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = input.nextLine().charAt(0);
        }
        char c = input.nextLine().charAt(0);

        System.out.println(count(chars, c));

    }

    public static int count(char[] chars, char c) {
        return count(chars, c, chars.length - 1);
    }
    public static int count(char[] chars, char c, int high) {

        if (high < 0)
            return 0;
        else {
            return count(chars, c, high - 1) + (chars[high] == c ? 1 : 0);
        }
    }
}
