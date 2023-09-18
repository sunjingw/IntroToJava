package Chapter3;

import java.util.Scanner;

public class Ex3_10 {
    public static void main(String[] args) {

        //Game - addition quiz
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);

        System.out.println("What is " + num1 + " + " + num2 + "?");

        int answer = input.nextInt();

        if (answer == (num1 + num2)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrecct");
        }
    }
}
