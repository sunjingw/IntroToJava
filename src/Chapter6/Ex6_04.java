package Chapter6;

import java.util.Scanner;

public class Ex6_04 {
    public static void main(String[] args) {

        //Display an integer reversed
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();
        reverse(num);
    }

    public static void reverse(int number) {

        String num = number + "";

        for (int i = num.length() - 1; i >= 0; i--) {
            System.out.print(num.charAt(i));
        }

    }
}
