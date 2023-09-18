package Chapter3;

import java.util.Scanner;

public class Ex3_02 {
    public static void main(String[] args) {

        //Game - add three numbers
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);

        System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + "?");

        int answer = input.nextInt();

        if (answer == num1+num2+num3) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }

    }
}
