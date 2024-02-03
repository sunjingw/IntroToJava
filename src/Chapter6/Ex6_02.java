package Chapter6;

import java.util.Scanner;

public class Ex6_02 {
    public static void main(String[] args) {

        //Sum the digits in an integer
        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number to sum: ");
        int num = input.nextInt();
        System.out.println(sumDigits(num));
    }

    public static int sumDigits(long n) {

        boolean cont = true;
        int num = 0;

        while (cont) {
            num += n % 10;

            n = n / 10;

            if (n == 0) {
                cont = false;
            }
        }

        return num;
    }
}
