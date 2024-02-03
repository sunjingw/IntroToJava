package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_16 {
    public static void main(String[] args) {

        //Execution time
        Scanner input = new Scanner(System.in);

        int[] list = new int[100000];
        int key = (int)(Math.random() * 100);

        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100);
        }

        System.out.println("Binary search " + executionTimeBinarySearch(list, key) + " ms");

        System.out.println("Linear search " + executionTimeLinearSearch(list, key) + " ms");


    }

    public static long executionTimeLinearSearch(int[] list, int key) {

        long startTime = System.currentTimeMillis();
        //perform task from here

        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println(executionTime);
        return executionTime;
    }

    public static long executionTimeBinarySearch(int[] list, int key) {

        int[] sortedList = sortArray(list);

        long startTime = System.currentTimeMillis();
        //perform task from here

        int high = sortedList.length-1;
        int low = 0;

        while (high >= low) {

                int mid = (low + high) / 2;

                if (key < sortedList[mid]) {
                    high = mid - 1;
                } else if (key == sortedList[mid]) {
                    break;
                } else {
                    low = mid + 1;
                }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println(executionTime);
        return executionTime;
    }

    public static int[] sortArray(int[] list) {

        int[] sortedList = new int[list.length];
        System.arraycopy(list, 0, sortedList, 0, list.length);

        for (int i = 0; i < sortedList.length; i++) {

            int min = sortedList[i];
            int minIndex = i;

            for (int j = i; j < sortedList.length; j++) {

                if (sortedList[j] < min) {
                    minIndex = j;
                    min = sortedList[j];
                }
            }
            if (minIndex != i) {

                sortedList[minIndex] = sortedList[i];
                sortedList[i] = min;
            }
        }

        return sortedList;
    }
}
