package Chapter6;

import java.util.Scanner;

public class Ex6_31 {
    public static void main(String[] args) {

        //Financial - credit card number validation
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number 13 to 16 digits: ");
        long cc = input.nextLong();

        int total = sumOfDoubleEvenPlace(cc) + sumOfOddPlace(cc);

        System.out.println(cc + " " + (isValid(total) ? "is valid" : "is invalid"));
    }

    public static boolean isValid(long number) {

        return number % 10 == 0;
    }

    public static int sumOfDoubleEvenPlace(long number) {

        String num = number + "";
        int sum = 0;

        for (int i = num.length() - 2; i >= 0; i-=2) {
            sum += getDigit(Character.getNumericValue(num.charAt(i)));
        }

        return sum;
    }

    public static int getDigit(int number) {

        String num = number + "";

        if (number >= 0 && number <= 4)
            return number * 2;
        else {
            num = (number * 2) + "";
            return Character.getNumericValue(num.charAt(0)) + Character.getNumericValue(num.charAt(1));
        }

    }

    public static int sumOfOddPlace(long number) {

        String num = number + "";
        int sum = 0;

        for (int i = num.length() - 1; i >= 0; i-=2) {
            sum += Character.getNumericValue(num.charAt(i));
        }

        return sum;
    }

    //public static boolean prefixMatched(long number, int d) {

    //}

    public static int getSize(long d) {
        String size = d + "";

        return size.length();
    }

    //public static long getPrefix(long number, int k) {

    //}
}
