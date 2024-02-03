package Chapter18;

import java.util.*;

public class Ex18_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter fib index: ");
        int n = input.nextInt();

        int f0 = 0;
        int f1 = 1;
        int currentFib = 0;
        for (int i = 2; i <= n; i++) {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
        }

        System.out.println(currentFib);
    }
}
