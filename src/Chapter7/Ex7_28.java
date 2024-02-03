package Chapter7;

import java.util.Scanner;

public class Ex7_28 {
    public static void main(String[] args) {

        //Math - combinations
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten integers: ");
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        findCombination(num);
    }

    public static void findCombination(int[] num) {

        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                System.out.print(num[i] + " " + num[j] + "\n");
            }
        }
    }
}
