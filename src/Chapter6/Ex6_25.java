package Chapter6;

import java.util.Scanner;

public class Ex6_25 {
    public static void main(String[] args) {

        //Convert milliseconds to hours, minutes, and seconds
        Scanner input = new Scanner(System.in);

        System.out.println("Enter milliseconds to convert: ");
        long ms = input.nextLong();

        System.out.println(convertMilli(ms));
    }
    public static String convertMilli(long ms) {

        long seconds = ms / 1000 % 60;
        long minutes = ms / 1000 / 60 % 60;
        long hours = ms / 1000 / 60 / 60 % 24;

        return hours + ":" + minutes + ":" + seconds;

    }
}
