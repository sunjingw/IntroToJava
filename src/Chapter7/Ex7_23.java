package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_23 {
    public static void main(String[] args) {

        //Game - locker puzzle
        Scanner input = new Scanner(System.in);

        boolean[] lockers = new boolean[100];

        printLockers(lockers(lockers));

    }

    public static boolean[] lockers(boolean[] lockers) {

        for (int i = 0; i < lockers.length; i++) {

            for (int j = 0; j < lockers.length;) {

                if (j >= i) {
                    if (lockers[j] == true)
                        lockers[j] = false;
                    else
                        lockers[j] = true;

                    j += i + 1;
                } else
                    j++;

            }
        }

        return lockers;

    }

    public static void printLockers(boolean[] lockers) {

        int count = 0;

        for (boolean e : lockers) {
            if (e == true)
                System.out.println("locker #" + (count + 1) + " is open");

            count++;
        }
    }
}
