package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_20 {
    public static void main(String[] args) {

        //Revise  selection sort
        Scanner input = new Scanner(System.in);

        double[] list = new double[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        System.out.println(Arrays.toString(selectionSort(list)));
    }

    public static double[] selectionSort(double[] list) {

        for (int i = list.length - 1; i >= 0; i--) {

            double max = list[i];
            int index = i;

            for (int j = i; j >= 0; j--) {

                if (list[j] > max) {
                    max = list[j];
                    index = j;
                }
            }

            if (index != i) {
                list[index] = list[i];
                list[i] = max;
            }
        }

        return list;
    }
}
