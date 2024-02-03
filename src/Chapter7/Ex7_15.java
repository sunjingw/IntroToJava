package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_15 {
    public static void main(String[] args) {

        //Eliminate duplicates
        Scanner input = new Scanner(System.in);

        int[] list = new int[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();

        }

        int[] removeDupes = eliminateDuplicates(list);

        System.out.println(Arrays.toString(list));

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < removeDupes.length; i++) {
            if (removeDupes[i] != 0)
                System.out.print(removeDupes[i] + " ");
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < newList.length; j++) {

                if (list[i] == newList[j]) {
                    break;
                } else if (newList[j] == 0 && list[i] != 0) {
                    newList[j] = list[i];
                    break;
                }
            }
        }

        return newList;
    }
}
