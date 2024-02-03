package Chapter18;

import java.util.*;

public class Ex18_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        reverseDisplay(12345);
    }

    public static void reverseDisplay(int n) {

        if (n == 0)
            return;
        else {
            System.out.print(n % 10);
            reverseDisplay(n / 10);
        }
    }
}
