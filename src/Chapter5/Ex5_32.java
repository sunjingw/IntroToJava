package Chapter5;

import java.util.Scanner;

public class Ex5_32 {
    public static void main(String[] args) {

        //Game - lottery
        Scanner input = new Scanner(System.in);

        //Generate two distinct digits

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        while (num2 == num1) {
            num2 = (int)(Math.random() * 10);
        }

        System.out.println("" + num1 + num2);
    }
}
