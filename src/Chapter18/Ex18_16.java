package Chapter18;

import java.util.*;

public class Ex18_16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] c = new char[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = input.nextLine().charAt(0);
        }

        System.out.println(count(c));
    }

    public static int count(char[] chars) {
        return count(chars, chars.length - 1);
    }

    public static int count(char[] c, int high) {

        int count = 0;

        if (high < 0) {
            return count;
        } else {
            count = count(c, high - 1);
        }

        if (Character.isUpperCase(c[high])) {
            count++;
        }

        return count;
    }
}
