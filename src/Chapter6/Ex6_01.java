package Chapter6;

import java.util.Scanner;

public class Ex6_01 {
    public static void main(String[] args) {

        //Math - pentagonal numbers
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int i = 1; i <= 100; i++) {

            System.out.print(getPentagonalNumber(i) + " ");

            count++;

            if (count % 10 == 0) {
                System.out.println();

            }

        }

    }
        //Method to calculate pentagonal number
        public static int  getPentagonalNumber(int n) {
            return n * (3 * n - 1) / 2;
        }

}
