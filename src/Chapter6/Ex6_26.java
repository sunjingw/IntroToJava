package Chapter6;

import java.util.Scanner;

public class Ex6_26 {
    public static void main(String[] args) {

        //Palindromic prime
        Scanner input = new Scanner(System.in);


        int count = 0;
        int num = 2;

        while (count < 100) {
            if (isPrime(num) && isPalindrome(num)) {
                System.out.print(num + " ");

                count++;

                if (count % 10 == 0)
                    System.out.println();
            }

            num++;
        }
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static boolean isPalindrome(int num) {

        String s = num + "";

        for (int i = 0, j = s.length() - 1; i < s.length() && j >= 0; i++, j--) {
            if (s.charAt(i) == s.charAt(j)) {
                continue;
            } else
                return false;
        }

        return true;
    }
}
