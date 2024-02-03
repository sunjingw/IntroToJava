package Chapter6;

import java.util.Scanner;

public class Ex6_18 {
    public static void main(String[] args) {

        //Check password
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String pass = input.nextLine();

        if (checkPassword(pass))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    public static boolean checkPassword(String pass) {

        boolean isLetterChar = false;
        boolean twoDigits = false;
        int digits = 0;

        for (int i = 0; i < pass.length(); i++) {
            if ((pass.charAt(i) >= '0' && pass.charAt(i) <= '9') || (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') ||
                    (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z')) {
                isLetterChar = true;
            } else {
                isLetterChar = false;
                break;
            }

            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                digits++;
                if (digits >= 2)
                    twoDigits = true;

            }

        }
        if (pass.length() >= 8 && isLetterChar && twoDigits)
            return true;
        else
            return false;
    }
}
