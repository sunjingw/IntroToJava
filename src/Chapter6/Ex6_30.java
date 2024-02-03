package Chapter6;

import java.util.Scanner;

public class Ex6_30 {
    public static void main(String[] args) {

        //Game - craps
        Scanner input = new Scanner(System.in);

        int roll = roll();
        checkRoll(roll);

    }

    public static int roll() {

        int num1 = (int)(Math.random() * 6 + 1);
        int num2 = (int)(Math.random() * 6 + 1);

        System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));

        return num1 + num2;
    }

    public static void checkRoll(int num) {

        if (num == 7 || num == 11) {
            System.out.println("You win");

        } else if (num == 2 || num == 3 || num == 12) {
            System.out.println("You lose");

        } else {

            System.out.println("Point is " + num);
            rollAgain(num);
        }

    }

    public static void rollAgain(int num) {

        int total = roll();

        if (total == num) {
            System.out.println("You win");
        } else if (total == 7) {
            System.out.println("You lose");
        } else {
            System.out.println("Point is " + total);
            rollAgain(total);
        }

    }


}
