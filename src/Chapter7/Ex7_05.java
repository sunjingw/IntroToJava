package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_05 {
    public static void main(String[] args) {

        //Print distinct numbers
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

        }

        distinct(numbers);

    }

    public static void distinct(int[] numbers) {

        int count = 0;
        int[] distinct = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < distinct.length; j++) {

                if (distinct[j] == 0) {
                    distinct[j] = numbers[i];
                    count++;
                    break;
                } else if (numbers[i] == distinct[j]) {
                    break;
                }
            }
        }

        System.out.println("The number of distinct numbers is " + count);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
                System.out.print(distinct[i] + " ");
            }
    }

}
