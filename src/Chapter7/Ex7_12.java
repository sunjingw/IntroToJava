package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex7_12 {
    public static void main(String[] args) {

        //Reverse an array
        Scanner input = new Scanner(System.in);

        int[] num = new int[10];
        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(num));

        System.out.println(Arrays.toString(reverse(num)));

        System.out.println(Arrays.toString(num));
    }

    public static int[] reverse(int[] arr) {

        int temp = 0;

        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;
    }
}
