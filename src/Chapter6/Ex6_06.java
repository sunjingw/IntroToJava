package Chapter6;

import java.util.Scanner;

public class Ex6_06 {
    public static void main(String[] args) {

        //Display patterns
        Scanner input = new Scanner(System.in);


        displayPattern(6);
    }

    public static void displayPattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int k = 1; k < n - i; k++) {
                System.out.print("  ");
            }

            for (int j = i + 1; j >= 1; j--) {

                System.out.print(j + " ");

            }

            System.out.println();
        }
    }
}
