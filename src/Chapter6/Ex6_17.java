package Chapter6;

import java.util.Scanner;

public class Ex6_17 {
    public static void main(String[] args) {

        //Display matrix of 0s and 1s
        Scanner input = new Scanner(System.in);

        printMatrix(3);

    }

    public static void printMatrix(int n) {
        int element = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                element = (int) (Math.random() + 0.5);
                System.out.print(element + " ");
            }
            System.out.println();
        }



    }
}
