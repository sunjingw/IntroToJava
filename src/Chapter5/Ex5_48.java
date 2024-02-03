package Chapter5;

import java.util.Scanner;

public class Ex5_48 {
    public static void main(String[] args) {

        //Process string
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = input.nextLine();

        String odd = "";

        for (int i = 0; i < s.length(); i+=2) {
            odd += s.charAt(i);
        }

        System.out.println(odd);
    }
}
