package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_32 {
    public static void main(String[] args) {

        //Partition of a list
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list: ");
        int size = input.nextInt();

        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {

            list[i] = input.nextInt();
        }

        int pivot = list[0];

        System.out.println("index of pivot is " + partition(list, pivot));

    }

    public static int partition(int[] list, int pivot) {

        int[] partList = new int[list.length];
        int revIndex = partList.length - 1;
        int index = 0;

        for (int i = 0; i < list.length; i++) {

            if (i + 1 < list.length) {
                if (list[i + 1] < pivot) {
                    partList[index] = list[i + 1];
                    index++;
                } else if (list[i + 1] > pivot) {
                    partList[revIndex] = list[i + 1];
                    revIndex--;
                }
            } else
                partList[index] = pivot;

        }

        System.out.println(Arrays.toString(partList));
        return index;

    }
}
