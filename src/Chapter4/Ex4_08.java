package Chapter4;

import java.util.Scanner;

public class Ex4_08 {
    public static void main(String[] args) {

        //Find the character of an ASCII code
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an ASCII code: ");
        int code = input.nextInt();

        System.out.println("The character for ASCII code " + code + " is " +(char)code);
    }
}
