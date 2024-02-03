package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_02 {
    public static void main(String[] args) {

        //Reverse the numbers entered
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {

            numbers[i] = input.nextInt();

        }

        System.out.println(Arrays.toString(reverse(numbers)));
    }

    public static int[] reverse(int[] numbers) {

        int[] reverse = new int[10];

        int k = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            reverse[k] = numbers[i];
            k++;
        }

        return reverse;

    }
}
