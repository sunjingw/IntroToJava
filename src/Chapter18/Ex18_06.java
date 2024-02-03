package Chapter18;

import java.util.*;

public class Ex18_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n = input.nextDouble();

        System.out.println(sum(n));
    }

    public static double sum(double n) {

        if (n == 0) {
            return 0;
        } else {
            return n/(n + 1) + sum(n -1);
        }
    }
}
