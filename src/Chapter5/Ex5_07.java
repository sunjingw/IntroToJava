package Chapter5;

import java.util.Scanner;

public class Ex5_07 {
    public static void main(String[] args) {

        //Financial application - compute future tuition
        Scanner input = new Scanner(System.in);

        double tuition = 10000;
        final double INTEREST = 0.05;
        double fourYearsTution = 0;

        for (int i = 0; i < 10; i++) {
            tuition *= 1 + INTEREST;
        }

        System.out.printf("The tuition after tenth year is $%1.2f\n", tuition);

        for (int i = 0; i < 4; i++) {
            fourYearsTution += tuition;
            tuition *= 1 + INTEREST;
        }

        System.out.printf("After tenth year, the four-year tuition is $%1.2f", fourYearsTution);
    }

}
