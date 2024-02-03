package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_21 {
    public static void main(String[] args) {

        //Game - bean machine
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of balls to drop: ");
        int balls = input.nextInt();

        System.out.println("Enter the number of slots in the machine: ");
        int slot = input.nextInt();

        int[] slots = new int[slot];

        playSlot(slots, balls);

    }

    public static void playSlot(int[] slots, int balls) {

        for (int i = 0; i < balls; i++) {

            int sum = 0;

            for (int j = 0; j < slots.length - 1; j++) {

                int direction = (int)(Math.random() * 2); //generate a 0 for left or 1 for right direction
                sum += direction; //sum up all the right direction values

                if (direction == 0)
                    System.out.print("L");
                else
                    System.out.print("R");

            }

            slots[sum]++;
            System.out.println();

        }

        System.out.println(Arrays.toString(slots));

        printBalls(slots);

    }

    public static void printBalls(int[] slots) {

        int rows = 0;

        for (int e : slots) {
            if (e > rows)
                rows = e;
        }

        for (int i = rows; i > 0; i--) {

            for (int j = 0; j < slots.length; j++) {

                if (slots[j] >= i && slots[j] != 0) {
                    System.out.print("0 ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
