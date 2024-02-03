package Chapter18;

import java.util.*;

public class Ex18_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        System.out.println(countUppercase(s));
    }
    public static int countUppercase(String s) {
        return countUppercase(s, s.length() - 1, 0);
    }
    public static int countUppercase(String s, int n, int count) {

        if (n < 0) {
            return count;
        } else {
            count = countUppercase(s, n - 1, count);
        }

        if (Character.isUpperCase(s.charAt(n))) {
            count++;
        }
        return count;
    }
}
