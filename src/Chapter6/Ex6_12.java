package Chapter6;

import java.util.Scanner;

public class Ex6_12 {
    public static void main(String[] args) {

        //Display characters
        Scanner input = new Scanner(System.in);

        printChars('1', 'Z', 5);

    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int count = 0;

        for (int i = ch1 + 1; i < ch2; i++) {

            System.out.print((char)i + " ");

            count++;

            if (count % numberPerLine == 0) {
                System.out.println();
            }

        }
    }
}
