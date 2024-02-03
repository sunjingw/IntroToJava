package Chapter10;

import java.util.Scanner;
import java.util.Stack;

public class Ex10_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StackOfInteger factors = new StackOfInteger();

        System.out.println("Enter an integer: ");
        int num = input.nextInt();

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {

                factors.push(i);
                num = num / i;
                i--;
            }
        }

        while (!factors.empty()) {
            System.out.print(factors.pop() + " ");
        }
    }
}
