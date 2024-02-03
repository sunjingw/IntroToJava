package Chapter18;

import java.util.*;

public class Ex18_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println(gcd(n1, n2));
    }

    public static int gcd(int m, int n) {

        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
}
