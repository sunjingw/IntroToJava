package Chapter3;

import java.util.Scanner;

public class Ex3_21 {
    public static void main(String[] args) {

        //Science - day of the week
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");

        int year = input.nextInt();

        System.out.println("Enter month: ");

        int month = input.nextInt();

        System.out.println("Enter day of the month: ");

        int day = input.nextInt();

        if (month == 1 || month == 2) {
            month += 12;
            year = year - 1;
        }

        int calc = (day + (26 * (month + 1) / 10) + (year % 100) + ((year % 100) / 4)
                + (year / 100)  / 4 + (5 * year / 100)) % 7;

        String theDay = "";

        switch (calc) {
            case 0:
                theDay = "Saturday";
                break;
            case 1:
                theDay = "Sunday";
                break;
            case 2:
                theDay = "Monday";
                break;
            case 3:
                theDay = "Tuesday";
                break;
            case 4:
                theDay = "Wednesday";
                break;
            case 5:
                theDay = "Thursday";
                break;
            case 6:
                theDay = "Friday";
                break;
        }

        System.out.println("Day of the week is " + theDay);
    }
}
