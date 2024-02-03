package Chapter6;

import java.util.Scanner;

public class Ex6_21 {
    public static void main(String[] args) {

        //Phone keypads
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                System.out.print(getNumber(s.charAt(i)));
            else
                System.out.print(s.charAt(i));
        }



    }

    public static int getNumber(char uppercaseLetter) {

        String s = uppercaseLetter + "";

        if ((uppercaseLetter >= 'a' && uppercaseLetter <= 'c') || (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')) {
            return 2;
        } else if ((uppercaseLetter >= 'd' && uppercaseLetter <= 'f') || (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')) {
            return 3;
        } else if ((uppercaseLetter >= 'g' && uppercaseLetter <= 'i') || (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')) {
            return 4;
        } else if ((uppercaseLetter >= 'j' && uppercaseLetter <= 'l') || (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')) {
            return 5;
        } else if ((uppercaseLetter >= 'm' && uppercaseLetter <= 'o') || (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')) {
            return 6;
        } else if ((uppercaseLetter >= 'p' && uppercaseLetter <= 's') || (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')) {
            return 7;
        } else if ((uppercaseLetter >= 't' && uppercaseLetter <= 'v') || (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')) {
            return 8;
        } else if ((uppercaseLetter >= 'w' && uppercaseLetter <= 'z') || (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z')) {
            return 9;
        }

        return -1;
    }


}
