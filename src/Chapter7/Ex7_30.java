package Chapter7;

import java.util.Scanner;

public class Ex7_30 {
    public static void main(String[] args) {

        //Pattern recognition - consecutive four equal numbers
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int size = input.nextInt();

        int[] values = new int[size];

        System.out.println("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }

        System.out.println("The list has " + (isConsecutiveFour(values) ? "consecutive fours" : "no consecutive fours"));

    }

    public static boolean isConsecutiveFour(int[] values) {

        for (int i = 0; i < values.length; i++) {

            if (i <= values.length - 3 && values[i] == values[i+1] && values[i] == values[i+2] && values[i] == values[i+3]) {

                return true;

            }
        }
        return false;
    }
}
