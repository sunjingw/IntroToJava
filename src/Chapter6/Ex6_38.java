package Chapter6;

import java.util.Scanner;

public class Ex6_38 {
    public static void main(String[] args) {

        //Generate random characters
        Scanner input = new Scanner(System.in);

        //Print 100 random uppercase and 100 random digits, 10 per line
        int count = 0;

        for (int i = 0; i < 200; i++) {

            if (count < 100) {
                int num = (int) (Math.random() * ('Z' - 'A' + 1) + 'A');
                System.out.print(getRandomChar(num) + " ");
                count++;
            } else {
                int numDigit = (int)(Math.random() * ('9' - '0' + 1) + '0');
                System.out.print(getRandomDigit(numDigit) + " ");
                count++;
            }

            if (count % 10 == 0)
                System.out.println();
        }
    }

    public static char getRandomChar(int n) {

        return (char)n;
    }

    public static char getRandomDigit(int n) {

        return (char)n;
    }
}
