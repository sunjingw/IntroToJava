package Chapter5;

import java.util.Scanner;

public class Ex5_14 {
    public static void main(String[] args) {

        //Compute the greatest common divisor
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = Math.min(num1, num2);

        while (gcd > 1) {
            if (num1 % gcd == 0 && num2 % gcd == 0) {
                System.out.println(gcd);
                break;
            } else {
                gcd--;
            }
        }

    }
}
