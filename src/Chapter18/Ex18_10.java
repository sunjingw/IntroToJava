package Chapter18;

import java.sql.SQLOutput;
import java.util.*;

public class Ex18_10 {
    static int count;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        count("WelAAccDDcome", 'c');
        System.out.println(count);
    }

    public static int count(String s, char c) {

        int n = s.length() - 1;

        if (s.charAt(n) == c)
            count++;

        if (n == 0) {
            return 0;
        } else {
            return count(s.substring(0, n), c);
        }
    }
}
