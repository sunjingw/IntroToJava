package Chapter5;

import java.util.Scanner;

public class Ex5_34 {
    public static void main(String[] args) {

        //Game - rock, paper, scissors
        Scanner input = new Scanner(System.in);

        //Keep playing rock paper scissors until the user or computer wins two in a row
        int userWin = 0;
        int cpuWin = 0;

        String hand = "";

        while (userWin != 2 || cpuWin != 2) {

            if (userWin == 2 || cpuWin == 2)
                break;
            else if (userWin == 1)
                cpuWin = 0;
            else if (cpuWin == 1)
                userWin = 0;

            int cpu = (int)(Math.random() * 3);

            switch (cpu) {
                case 0: hand = "Rock";
                break;
                case 1: hand = "Paper";
                break;
                case 2: hand = "Scissors";
                break;
            }

            System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors: ");
            int user = input.nextInt();

            System.out.println("The computer plays " + hand);

            if (user == cpu) {
                System.out.println("Tie");
            } else if (user == 0 && cpu == 2) {
                System.out.println("The player wins");
                userWin++;
            } else if (user == 0 && cpu == 1) {
                System.out.println("The CPU wins");
                cpuWin++;
            } else if (user == 1 && cpu == 0) {
                System.out.println("The player wins");
                userWin++;
            } else if (user == 1 && cpu == 2) {
                System.out.println("The CPU wins");
                cpuWin++;
            } else if (user == 2 && cpu == 0) {
                System.out.println("The CPU wins");
                cpuWin++;
            } else if (user == 2 && cpu == 1) {
                System.out.println("The player wins");
                userWin++;
            }
        }
    }
}
