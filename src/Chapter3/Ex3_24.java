package Chapter3;

import java.util.Scanner;

public class Ex3_24 {
    public static void main(String[] args) {

        //Game - pick a card
        Scanner input = new Scanner(System.in);

        int rank = (int)(Math.random() * 13 + 1);
        int suit = (int)(Math.random() * 4);

        String ranks = "";
        String suits = "";

        switch (rank) {
            case 1: ranks = "Ace";
            break;
            case 11: ranks = "Jack";
            break;
            case 12: ranks = "Queen";
            break;
            case 13: ranks = "King";
            break;
            default: ranks = rank + "";
        }

        switch (suit) {
            case 0: suits = "Clubs";
            break;
            case 1: suits = "Diamonds";
            break;
            case 2: suits = "Hearts";
            break;
            case 3: suits = "Spades";
            break;

        }

        System.out.println("The card you picked is " + ranks + " of " + suits);

    }
}
