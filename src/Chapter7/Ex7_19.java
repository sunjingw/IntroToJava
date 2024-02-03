package Chapter7;

import java.util.Scanner;

public class Ex7_19 {
    public static void main(String[] args) {

        //Sorted?
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of list: ");
        int size = input.nextInt();

        int[] list = new int[size];

        System.out.println("Enter the numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        System.out.println("The list is " + (isSorted(list) ? "already sorted" : "not sorted"));

    }

    public static boolean isSorted(int[] list) {

        for (int i = 0; i < list.length; i++) {

            for (int j = i; j < list.length; j++) {

                if (list[i] > list[j])
                    return false;
            }
        }
        return true;
    }
}
