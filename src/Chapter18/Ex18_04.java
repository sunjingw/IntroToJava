package Chapter18;

import java.util.*;

public class Ex18_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double n = input.nextDouble();

        System.out.println(sum(n));
    }

    public static double sum(double n) {

        if (n == 1) {
            return 1;
        } else {
            return 1/n + sum(n -1);
        }
    }
}
