package Chapter8;

import java.util.Scanner;

public class Ex8_01 {
    public static void main(String[] args) {

        //Sum elements column by column
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3x4 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        sumColumn(matrix, 0);
    }

    public static double sumColumn(double[][] m, int columnIndex) {

        for (int col = 0; col < m[columnIndex].length; col++) {

            double total = 0;

            for (int row = 0; row < m.length; row++) {

                total += m[row][col];

            }

            System.out.println("Sum of the elements at column " + col + " is " + total);
        }

        return 0;

    }
}
