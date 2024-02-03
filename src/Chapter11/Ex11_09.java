package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size n: ");
        int n = input.nextInt();

        int[][] arr = generateArray(n);

        ArrayList<Integer> row = largestRow(arr);
        ArrayList<Integer> col = largestCol(arr);

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Largest row index: " + row);
        System.out.println("Largest column index: " + col);

    }

    public static int maxCol(int[][] arr) {
        int total = 0;
        int max = 0;
        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {
                total += arr[row][col];
            }
            if (total > max) {
                max = total;
            }
            total = 0;
        }
        return max;
    }

    public static int maxRow(int[][] arr) {

        int total = 0;
        int max = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col< arr[row].length; col++) {
                total += arr[row][col];
            }
            if (total > max) {
                max = total;
            }
            total = 0;

        }
        return max;
    }

    public static ArrayList<Integer> largestCol(int[][] arr) {
        ArrayList<Integer> colArray = new ArrayList<>();

        int max = maxCol(arr);
        int total = 0;

        for (int col = 0; col < arr.length; col++) {

            for (int row = 0; row < arr[col].length; row++) {
                total += arr[row][col];
            }
            if (total >= max) {
                colArray.add(col);
            }
            total = 0;

        }
        return colArray;
    }
    public static ArrayList<Integer> largestRow(int[][] arr) {
        ArrayList<Integer> rowArray = new ArrayList<>();

        int max = maxRow(arr);
        int total = 0;

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col< arr[row].length; col++) {
                total += arr[row][col];
            }
            if (total >= max) {
                rowArray.add(row);
            }
            total = 0;

        }
        return rowArray;
    }

    public static int[][] generateArray(int n) {
        int[][] arr = new int[n][n];

        for (int row = 0; row < n; row++) {
            int rand1 = (int)(Math.random() * 2);

            for (int col = 0; col < n; col++) {
                int rand2 = (int)(Math.random() * 2);

                arr[row][col] = rand2;
            }
        }
        return arr;
    }
}
