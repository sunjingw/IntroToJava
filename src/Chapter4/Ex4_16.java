package Chapter4;

import java.util.Scanner;

public class Ex4_16 {
    public static void main(String[] args) {

        //Random character
        Scanner input = new Scanner(System.in);

        int random = (int)(Math.random() * 26 + 65);

        char ch = (char)random;

        System.out.println("Random character: " + ch);
    }
}
