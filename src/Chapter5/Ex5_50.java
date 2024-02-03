package Chapter5;

import java.util.Scanner;

public class Ex5_50 {
    public static void main(String[] args) {

        //Count uppercase letters
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        int uppercase = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                uppercase++;
            }
        }

        System.out.println("The number of uppercase letters is " + uppercase);
    }
}
