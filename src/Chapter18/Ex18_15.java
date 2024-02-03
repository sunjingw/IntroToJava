package Chapter18;

import java.util.*;

public class Ex18_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        char a = input.nextLine().charAt(0);

        System.out.println(count(s, a));
    }

    public static int count(String s, char a) {
        return count(s, a, s.length() - 1);
    }
    public static int count(String s, char a, int n) {

        int count = 0;
        if (n < 0) {
            return count;
        } else {
            count = count(s, a, n - 1);
        }

        if (s.charAt(n) == a) {
            count++;
        }
        return count;
    }
}
