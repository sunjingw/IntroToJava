package Chapter6;

import java.util.Scanner;

public class Ex6_34 {
    public static void main(String[] args) {

        //Print calendar
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();

        System.out.println("Enter the month: ");
        int month = input.nextInt();

        int day = 1;

        System.out.println("Day of the week is " + day(displayStartDay(day, month, year/100, year%100)));

    }

    public static int displayStartDay(int q, int m, int j, int k) {

        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        return h;
    }

    public static String day(int n) {
        String day = "";

        switch (n) {
            case 1: day = "Sunday";
                break;
            case 2: day = "Monday";
                break;
            case 3: day = "Tuesday";
                break;
            case 4: day = "Wednesday";
                break;
            case 5: day = "Thursday";
                break;
            case 6: day = "Friday";
                break;
            case 0: day = "Saturday";
                break;

        }
        return day;
    }
}
