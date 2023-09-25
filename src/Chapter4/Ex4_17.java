package Chapter4;

import java.util.Scanner;

public class Ex4_17 {
    public static void main(String[] args) {

        //Days of a month
        Scanner input = new Scanner(System.in);

        /**
         * January 31
         * February 29 or 28 if leap year
         * March 31
         * April 30
         * May 31
         * June 30
         * July 31
         * Aug 31
         * Sept 30
         * Oct 31
         * Nov 30
         * Dec 31
         */

        System.out.println("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println("Enter a month: ");

        String month = input.nextLine();


        int days = 0;

        month = month.substring(0, 3);

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
            days = 31;
        } else if (month.equals("Feb")) {
            if (isLeapYear)
                days = 29;
            else
                days = 28;
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            days = 30;
        }

        System.out.println(month + " " + year + " has " + days + " days");

    }
}
