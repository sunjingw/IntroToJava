package Chapter3;

import java.util.Scanner;

public class Ex3_14 {
    public static void main(String[] args) {

        //Game - heads or tails
        Scanner input = new Scanner(System.in);

        System.out.println("Guess heads or tails?");

        String guess = input.nextLine();

        int num = (int)(Math.random() + 0.5);

        System.out.println(num);

        if ((guess.equalsIgnoreCase("heads") && num == 0) || (guess.equalsIgnoreCase("tails") && num == 1)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
