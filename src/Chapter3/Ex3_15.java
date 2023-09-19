package Chapter3;

import java.util.Scanner;

public class Ex3_15 {
    public static void main(String[] args) {

        //Game - lottery
        Scanner input = new Scanner(System.in);

        int num = (int)(Math.random() * 900 + 100);
        System.out.println(num);

        System.out.println("Enter a three digit guess: ");

        int guess = input.nextInt();

        int num1 = num / 100;
        int num2 = num / 10 % 10;
        int num3 = num % 10;

        int guess1 = guess / 100;
        int guess2 = guess / 10 % 10;
        int guess3 = guess % 10;



        if (guess == num) {
            System.out.println("Jackpot");
            System.out.println("You win $10,000!");

        } else if ((guess1 == num1 || guess1 == num2 || guess1 == num3) && (guess2 == num1 || guess2 == num2 || guess2 == num3)
        && (guess3 == num1 || guess3 == num2 || guess3 == num3)) {
            System.out.println("Guessed all digits correct");
            System.out.println("You win $3,000!");
        } else if ((guess1 == num1 || guess1 == num2 || guess1 == num3) ^ (guess2 == num1 || guess2 == num2 || guess2 == num3)
                ^ (guess3 == num1 || guess3 == num2 || guess3 == num3)) {
            System.out.println("Guessed one digit correct");
            System.out.println("You win $1,000!");
        } else {
            System.out.println("Not a winner");
        }
    }
}
