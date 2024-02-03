package Chapter6;

import java.util.Scanner;

public class Ex6_16 {
    public static void main(String[] args) {

        //Number of days in a year
        Scanner input = new Scanner(System.in);

        for (int i = 2000; i <= 2020; i++) {
            System.out.println(i + " has " + numberofDaysInAYear(i) + " days");
        }
    }

    public static int numberofDaysInAYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 366;
        } else {
            return 365;
        }

    }
}
