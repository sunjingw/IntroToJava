package Chapter5;

import java.util.Scanner;

public class Ex5_29 {
    public static void main(String[] args) {

        //Display calendar
        Scanner input = new Scanner(System.in);

        //Prompt year and first day of the year
        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter first day of the year: ");
        int date = input.nextInt();

        String day = "";
        String month = "";

        int numOfDays = 0;
        int count = 0;

        boolean isLeapYear = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }

        for (int i = 1; i <= 12; i++) {

            switch (i) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
            }


            switch (date) {
                case 0:
                    day = "Sunday";
                    break;
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
            }



            if (i == 4 || i == 6 || i == 9 || i == 11) {
                numOfDays = 30;

                //February with 29 days
            } else if (i == 2 && isLeapYear) {
                numOfDays = 29;

                //February with 28 days
            } else if (i == 2 && !isLeapYear) {
                numOfDays = 28;

                //Rest of the month has 31 days
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                numOfDays = 31;
            }


            System.out.printf("\t\t\t\t\t%s %d\n", month, year);
            System.out.println("----------------------------------------------------");
            System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat");

            if (date != 0) {
                for (int j = date; j > 0; j--) {
                    System.out.print("\t\t");
                }
            }

            int firstWeekLastDay = 7 - date;

            for (int k = 1; k <= numOfDays; k++) {

                System.out.print(k + "\t\t");

                if (firstWeekLastDay == k) {
                    System.out.println();

                } else if (k > firstWeekLastDay) {
                    count++;

                    if (count % 7 == 0)
                        System.out.println();
                }
            }

            System.out.println();
            System.out.println();

            //Add 30 days to the month to calculate next month's first day
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                date = (date + 30) % 7;

                //February with 29 days
            } else if (i == 2 && isLeapYear) {
                date = (date + 29) % 7;

                //February with 28 days
            } else if (i == 2 && !isLeapYear) {
                date = (date + 28) % 7;

                //Rest of the month has 31 days
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                date = (date + 31) % 7;
            }

            //reset counter for number of days in a week
            count = 0;

        }

    }
}
