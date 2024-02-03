package Chapter6;

import java.util.Scanner;

public class Ex6_32 {
    public static void main(String[] args) {

        //Game - chance of winning at craps
        Scanner input = new Scanner(System.in);

        int wins = 1;
        int check = 0;

        for (int i = 1; i <= 10000; i++) {

            int roll = roll();
            check = checkRoll(roll);

            if (check == 0)
                wins++;
            else if (check == 2) {
                if (checkSecondRoll(roll))
                    wins++;
            }

        }

        System.out.println("The number of wins: " + wins);
    }

    public static int roll() {

        int num1 = (int)(Math.random() * 6 + 1);
        int num2 = (int)(Math.random() * 6 + 1);

        System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));

        return num1 + num2;
    }

    public static int checkRoll(int num) {

        if (num == 7 || num == 11) {
            System.out.println(">>>>You win<<<<");
           return 0;

        } else if (num == 2 || num == 3 || num == 12) {
            System.out.println(">>>>You lose<<<<");
            return 1;

        } else {
            System.out.println("Point is " + num);
            return 2;

        }

    }

    public static boolean checkSecondRoll(int num) {

        int total = roll();

        if (total == num) {
            System.out.println(">>>>You win<<<<");
            return true;
        } else if (total == 7) {
            System.out.println(">>>>You lose<<<<");
            return false;
        } else {
            System.out.println("Point is " + total);
            checkSecondRoll(total);
        }

        return false;

    }


}
