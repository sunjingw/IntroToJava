package Chapter6;

import java.util.Scanner;

public class Ex6_03 {
    public static void main(String[] args) {

        //Palindrome integer
        Scanner input = new Scanner(System.in);

        System.out.println(reverse(123));

        System.out.println(isPalindrome(123321));

    }

    public static int reverse(int number) {

        String num = number + "";
        String n = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            n += num.charAt(i);
        }

        number = Integer.parseInt(n);

        return number;

    }

    public static boolean isPalindrome(int number) {

        String num = number + "";

        for (int i = 0; i < num.length() - 1; i++) {
            if (number % 10 == (int)num.charAt(i) - '0') {
                number = number / 10;

            } else
                return false;
        }
        return true;
    }
}
