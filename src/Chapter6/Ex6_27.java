package Chapter6;

import java.util.Scanner;

public class Ex6_27 {
    public static void main(String[] args) {

        //Emirp - prime spelled backward
        Scanner input = new Scanner(System.in);

        int count = 0;
        int num = 2;

        while (count < 100) {
            if (isPrime(num)) {
                if (isEmirp(num)) {
                    System.out.print(num + " ");
                    count++;

                    if (count % 10 == 0)
                        System.out.println();

                }
            }

            num++;

        }
    }

    public static boolean isPrime (int num) {

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isEmirp (int num) {

        String s = num + "";
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
                reverse += s.charAt(i);
        }

        if (isPrime(Integer.parseInt(reverse)))
            return true;
        else
            return false;
    }
}

