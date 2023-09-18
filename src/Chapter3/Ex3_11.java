package Chapter3;

import java.util.Scanner;

public class Ex3_11 {
    public static void main(String[] args) {

        //Find the number of days in a month
        Scanner input = new Scanner(System.in);

        System.out.println("Enter month: ");

        int month = input.nextInt();

        System.out.println("Enter year: ");

        int year = input.nextInt();

        //Find out if the year is a leap year
        boolean leapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            leapYear = true;
        }

        if (month == 1) {
            System.out.println("January " + year + " had 31 days");

        } else if (leapYear && month == 2) {
            System.out.println("February " + year + " had 29 days");

        } else if (!leapYear && month == 2) {
            System.out.println("February " + year + " had 28 days");

        } else if (month == 3) {
            System.out.println("March " + year + " had 31 days");

        } else if (month == 4) {
            System.out.println("April " + year + " had 30 days");

        } else if (month == 5) {
            System.out.println("May " + year + " had 31 days");

        } else if (month == 6) {
            System.out.println("June " + year + " had 30 days");

        } else if (month == 7) {
            System.out.println("July " + year + " had 31 days");

        } else if (month == 8) {
            System.out.println("August " + year + " had 31 days");

        } else if (month == 9) {
            System.out.println("September " + year + " had 30 days");

        } else if (month == 10) {
            System.out.println("October " + year + " had 31 days");

        } else if (month == 11) {
            System.out.println("November " + year + " had 30 days");

        } else {
            System.out.println("December " + year + " had 31 days");
        }
    }
}
