package Chapter6;

import java.util.Scanner;

public class Ex6_24 {
    public static void main(String[] args) {

        //Display current date and time
        Scanner input = new Scanner(System.in);

        long ms = System.currentTimeMillis();
        int seconds = getSecond(ms);
        int minutes = getMinute(ms);
        int hours = getHour(ms);


        int years = getYear(ms);
        int month = getMonth(ms);
        int day = getDate(ms);


        System.out.println(ms);
        System.out.println((hours - 4) + ":" + minutes + ":" + seconds);

        System.out.println(month + "-" + day + "-" + years);

        System.out.println(getDays(ms));



    }

    public static int getMonth(long ms) {

        return getDays(ms) / 30 + 1;
    }

    public static int getDays(long ms) {

        int numDays = 0;
        int days = (int)(ms / 1000 / 60 / 60 / 24);

        for (int i = 0; i < days / 365; i++) {

            if (isLeapYear(1970 + i)) {
                numDays += 366;
            } else
                numDays += 365;
        }

        return days - numDays;
    }

    public static boolean isLeapYear (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else
            return false;
    }
    public static int getDate(long ms) {

        int days = getDays(ms);
        int numDays = 0;

        for (int i = 1; i < getMonth(ms); i++) {

            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                numDays += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                numDays += 30;
            } else {
                if (isLeapYear(getYear(ms))) {
                    numDays += 29;
                } else
                    numDays += 28;
            }
        }


        return days - numDays + 1;
    }

    public static int getYear(long ms) {

        return (int)(ms / 1000 / 60 / 60 / 24 / 365) + 1970;
    }

    public static int getHour(long minutes) {

        return (int)(minutes / 1000 / 60 / 60) % 24;
    }

    public static int getMinute(long seconds) {

        return (int)(seconds / 1000 / 60) % 60;
    }

    public static int getSecond(long ms) {

        return (int)(ms / 1000) % 60;
    }
}
