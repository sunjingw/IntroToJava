package Chapter4;

import java.util.Scanner;

public class Ex4_10 {
    public static void main(String[] args) {

        //Guess birthday
        Scanner input = new Scanner(System.in);

        System.out.println(""" 
                 1  3  5  7
                 9 11 13 15
                17 19 21 23
                25 27 29 31""");

        System.out.println("Is your birth in this set?");
        System.out.println("Enter Y or N");

        String y1 = input.nextLine();

        System.out.println("""
                 2  3  6  7
                10 11 14 15
                18 19 22 23
                26 27 30 31
                """);
        System.out.println("Is your birthday in this set?");
        System.out.println("Enter Y or N");

        String y2 = input.nextLine();

        System.out.println("""
                 4  5  6  7
                12 13 14 15
                20 21 22 23
                28 29 30 31
                """);
        System.out.println("Is your birthday in this set?");
        System.out.println("Enter Y or N");

        String y3 = input.nextLine();

        System.out.println("""
                  8  9 10 11
                 12 13 14 15
                 24 25 26 27
                 28 29 30 31
                """);
        System.out.println("Is your birthday in this set?");
        System.out.println("Enter Y or N");

        String y4 = input.nextLine();

        System.out.println("""
                16 17 18 19
                20 21 22 23
                24 25 26 27
                28 29 30 31
                """);
        System.out.println("Is your birthday in this set?");
        System.out.println("Enter Y or N");

        String y5 = input.nextLine();

        int day = 0;

        if (y1.charAt(0) == 'Y') {
            day += 1;
        }

        if (y2.charAt(0) == 'Y') {
            day += 2;
        }

        if (y3.charAt(0) == 'Y') {
            day += 4;
        }

        if (y4.charAt(0) == 'Y') {
            day += 8;
        }

        if (y5.charAt(0) == 'Y') {
            day += 16;
        }

        System.out.println("Your birthday is " + day);
    }
}
