package Chapter5;

import java.util.Scanner;

public class Ex5_27 {
    public static void main(String[] args) {

        //Display leap years from 101 to 2100
        Scanner input = new Scanner(System.in);

        int countYears = 0;

        for (int i = 101; i <= 2100; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0 ) {
                System.out.print(i + " ");

                countYears++;

                if (countYears % 10 == 0) {
                    System.out.println();
                }

            }
        }

    }
}
