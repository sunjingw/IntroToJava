package Chapter3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Determining leap year
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        //Divisible by 4 but not by 100, or divisible by 400
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeapYear) {
            System.out.println(year + " is a leap year!");

        } else {
            System.out.println(year + " is not a leap year!");
        }



    }
}
