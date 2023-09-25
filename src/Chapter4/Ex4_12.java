package Chapter4;

import java.util.Scanner;

public class Ex4_12 {
    public static void main(String[] args) {

        //Hex to binary
        Scanner input = new Scanner(System.in);

        System.out.println((int)'1');
        System.out.println((int)'F');
        System.out.println("Enter a hex digit: ");
        String s = input.nextLine();

        int num = 0;

        if ((char)s.charAt(0) > '0' && (char)s.charAt(0) <= '9') {
            num = Integer.parseInt(s);
        } else if ((char)s.charAt(0) >= 'A' && (char)s.charAt(0) <= 'F') {
            num = (int)((char)s.charAt(0) - 55);
        } else {
            System.out.println(s + " is an invalid input");
            System.exit(1);
        }

        int b0, b1, b2, b3;

        b3 = num % 2;
        b2 = num /2 % 2;
        b1 = num / 2 / 2 % 2;
        b0 = num / 2 / 2 / 2 % 2;

        System.out.println("The binary value is " + b0 + b1 + b2 + b3);


    }
}
