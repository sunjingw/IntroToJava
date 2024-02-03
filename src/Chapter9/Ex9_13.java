package Chapter9;

import java.util.Scanner;

public class Ex9_13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of rows and columns: ");
        int row = input.nextInt();
        int col = input.nextInt();

        double[][] arr = new double[row][col];
        Location l = new Location();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }

        l = Location.locateLargest(arr);

        System.out.println("The location of the largest element is " + l.maxValue);
        System.out.println("(" + l.row + ", " + l.column + ")");



    }
}
