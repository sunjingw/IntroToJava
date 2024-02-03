package Chapter18;

import java.util.*;

public class Ex18_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(findLargest(arr));
    }

    public static int findLargest(int[] arr) {
        return findLargest(arr, arr.length - 1, 0);
    }
    public static int findLargest(int[] arr, int n, int max) {

        if (n < 0) {
            return max;
        } else {
            max = findLargest(arr, n - 1, max);
        }
        if (max < arr[n]) {
            max = arr[n];
        }
        return max;



    }
}
