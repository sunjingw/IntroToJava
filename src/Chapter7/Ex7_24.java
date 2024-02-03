package Chapter7;

import java.util.Scanner;

public class Ex7_24 {
    public static void main(String[] args) {

        //Simulation - coupon collector's problem
        Scanner input = new Scanner(System.in);

        String[] suit = {"Spades", "Heart", "Clubs", "Diamonds"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        int[] suits = new int[4];

        int count = 0;

        do {
            System.out.println(generateCard(suit, rank, suits));
            count++;

        } while (!checkSuits(suits));


        System.out.println("Number of picks: " + count);

    }

    public static boolean checkSuits(int[] suits) {

        for (int i = 0; i < suits.length; i++) {
            if (suits[i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static String generateCard(String[] suit, String[] rank, int[] suits) {

        int rand = (int) (Math.random() * 52);

        suits[rand / 13] = 1;

        return rank[rand % 13] + " of " + suit[rand / 13];

    }
}
