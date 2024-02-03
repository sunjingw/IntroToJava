package Chapter7;

import java.util.Scanner;

public class Ex7_26 {
    public static void main(String[] args) {

        //Strictly identical arrays
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 size and contents: ");
        int size = input.nextInt();

        int[] list1 = new int[size];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.println("Enter list2 size and conents: ");
        int size2 = input.nextInt();

        int[] list2 = new int[size2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.println("Two lists are " + (equals(list1, list2) ? "strictly identical" : "not strictly identical"));

    }

    public static boolean equals(int[] list1, int[] list2) {

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }

        return true;
    }
}
