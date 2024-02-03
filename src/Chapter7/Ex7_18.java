package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_18 {
    public static void main(String[] args) {

        //Bubble sort
        Scanner input = new Scanner(System.in);

        double[] list = new double[10];

        System.out.println("Enter ten double numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        System.out.println(Arrays.toString(bubbleSort(list)));
    }

    public static double[] bubbleSort(double[] list) {


        for (int i = 0; i < list.length; i++) {

            double temp = 0;

            for (int j = 0; j < list.length - 1; j++) {

                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}
