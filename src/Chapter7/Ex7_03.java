package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_03 {
    public static void main(String[] args) {

        //Count occurrences of numbers
        Scanner input = new Scanner(System.in);

        int[] integers = new int[100];

        int index = 0;
        int num = -1;

        while (num != 0) {
            num = input.nextInt();
            integers[index] = num;
            index++;

        }

        printOccurrences(integers);
    }

    public static void printOccurrences(int[] numbers) {

        int[] count = new int[100];

        for (int i = 0; i < numbers.length; i++) {

           count[numbers[i]]++;
        }

        for (int i = 1; i < count.length; i++) {

            if (count[i] == 1) {
                System.out.println(i + " occurs " + count[i] + " time");
            } else if (count[i] > 1) {
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }
    }
}
