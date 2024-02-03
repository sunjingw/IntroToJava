package Chapter18;

import java.util.*;

public class Ex18_07 {
    static int count;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(fib(4));

        System.out.println("number of calls to fib: " + count);
    }

    public static int fib(int n) {

        count++;

        if (n == 1)
            return 1;
        else if (n == 0)
            return 0;
        else {
            return fib(n - 2) + fib(n - 1);
        }
    }


}
