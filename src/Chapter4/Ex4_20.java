package Chapter4;

import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {

        //Process a string
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        System.out.println("String's length is " + s.length() + " and the first character is " + s.charAt(0));
    }
}
