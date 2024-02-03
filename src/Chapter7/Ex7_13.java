package Chapter7;

import java.util.Scanner;

public class Ex7_13 {
    public static void main(String[] args) {

        //Random number chooser (12th ed.)
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 45; i++) {

            System.out.print(getRandom(1, 100, 4, 8, 95, 93) + " ");

            if (i % 15 == 0)
                System.out.println();

        }
    }

    public static int getRandom(int start, int end, int... numbers) {

        boolean generateRandom = true;
        int random = -1;

        while (generateRandom) {
            random = (int) (Math.random() * 100 + 1);

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] == random)
                    generateRandom = true;
                else
                    generateRandom = false;
            }
        }

        return random;
    }
}
