package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_31 {
    public static void main(String[] args) {

        //Merge two sorted list
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = input.nextInt();
        }

        int[] mergedList = merge(list1, list2);

        System.out.print("The merged list is ");
        for (int e : mergedList) {
            System.out.print(e + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            mergedList[i] = list1[i];
        }

        for (int i = list1.length; i < mergedList.length; i++) {
            mergedList[i] = list2[i - list1.length];
        }

        return selectionSort(mergedList);
    }

    public static int[] selectionSort(int[] list) {

        for (int i = 0; i < list.length; i++) {

            int min = list[i];
            int index = i;

            for (int j = i; j < list.length; j++) {

                if (list[j] < min) {
                    min = list[j];
                    index = j;
                }
            }

            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
        return list;
    }
}
