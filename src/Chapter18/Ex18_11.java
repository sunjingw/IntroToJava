package Chapter18;

import java.util.*;

public class Ex18_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(sumDigits(234));
    }

    public static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }
}
