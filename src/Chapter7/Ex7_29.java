package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_29 {
    public static void main(String[] args) {

        //Game - pick four cards
        Scanner input = new Scanner(System.in);

        int[] ranks = new int[52];

        for (int i = 0; i < ranks.length; i++) {
            ranks[i] = i + 1;
        }

        int count = 0;
        int picks = 0;

        do {

            if (count == 0) {
                count += generateFourCards(ranks, 4);
                picks += 4;
            } else if (count < 24) {
                count += generateFourCards(ranks, 1);
                picks++;
            }

        } while (count < 24);

        System.out.println("Sum is " + count);

        if (count == 24)
            System.out.println("Number of picks: " + picks);

    }

    public static int generateFourCards(int[] ranks, int pick) {

        int count = 0;

        for (int i = 0; i < pick; i++) {
            int random = (int) (Math.random() * 52);

            if (ranks[random] % 13 == 0) {
                System.out.println("King");
                count += 13;
            } else if (ranks[random] % 12 == 0) {
                System.out.println("Queen");
                count += 12;
            } else if (ranks[random] % 11 == 0) {
                System.out.println("Jack");
                count += 11;
            } else if (ranks[random] % 13 == 1) {
                System.out.println("Ace");
                count += 1;
            } else {
                System.out.println(ranks[random] % 13);
                count += ranks[random] % 13;
            }

        }

        return count;

    }
}
