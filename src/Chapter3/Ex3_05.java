package Chapter3;

import java.util.Scanner;

public class Ex3_05 {
    public static void main(String[] args) {

        //Find future dates
        Scanner input = new Scanner(System.in);

        System.out.println("Enter today's day 0 - 6: ");

        int day = input.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");

        int elapsed = input.nextInt();

        String today = "";

        String future = "";

        switch (day) {
            case 0: today = "Sunday";
                break;
            case 1: today = "Monday";
                break;
            case 2: today = "Tuesday";
                break;
            case 3: today = "Wednesday";
                break;
            case 4: today = "Thursday";
                break;
            case 5: today = "Friday";
                break;
            case 6: today = "Saturday";
                break;

        }

        switch (day + elapsed % 7) {
            case 0: future = "Sunday";
                break;
            case 1: future = "Monday";
                break;
            case 2: future = "Tuesday";
                break;
            case 3: future = "Wednesday";
                break;
            case 4: future = "Thursday";
                break;
            case 5: future = "Friday";
                break;
            case 6: future = "Saturday";
                break;
        }

        System.out.println("Today is " + today + " and the future day is " + future);
    }
}
