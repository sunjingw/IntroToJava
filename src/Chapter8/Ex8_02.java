package Chapter8;

import java.util.Scanner;

public class Ex8_02 {
    public static void main(String[] args) {

        //Sum the major diagonal in a matrix
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 4x4 matrix: ");

        double[][] matrix = new double[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double [][] m) {

        double total = 0;

        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {

                if (row == col) {
                    total += m[row][col];
                }
            }
        }

        return total;
    }
}
