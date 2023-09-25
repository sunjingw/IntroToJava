package Chapter3;

import java.util.Scanner;

public class Ex3_17 {
    public static void main(String[] args) {

        //Rock paper scissors
        Scanner input = new Scanner(System.in);

        System.out.println("scissor (0), rock (1), paper (2): ");

        int num = input.nextInt();
        int random = (int)(Math.random() * 3);

        String computer = "";
        String hand = "";

        switch (random) {
            case 0: computer = "scissor";
                break;
            case 1: computer = "rock";
                break;
            case 2: computer = "paper";
                break;
        }

        switch (num) {
            case 0: hand = "scissor";
                break;
            case 1: hand = "rock";
                break;
            case 2: hand = "paper";
                break;
        }

        if (num == random) {
            System.out.println("The computer is " + computer + ". You are " + hand + " too. It is a draw");

        } else if (num == 1 && random == 0) {
            System.out.println("The computer is " + computer + ". You are " + hand + ". You won");

        } else if (num == 1 && random == 2 ) {
            System.out.println("The computer is " + computer + ". You are " + hand + ". You lost");

        } else if (num == 0 && random == 1) {
            System.out.println("The computer is " + computer + ". You are " + hand + ". You lost");

        } else if (num == 0 && random == 2) {
            System.out.println("The computer is " + computer + ". You are " + hand + ". You won");

        } else if (num == 2 && random == 0) {
            System.out.println("The computer is " + computer + ". You are " + hand + ". You lost");

        } else {
            System.out.println("The computer is " + computer + ". You are " + hand + ". You won");
        }
    }
}
