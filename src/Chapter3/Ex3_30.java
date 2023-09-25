package Chapter3;

import java.util.Scanner;

public class Ex3_30 {
    public static void main(String[] args) {

        //Current time
        Scanner input = new Scanner(System.in);

        long milliseconds = System.currentTimeMillis();

        long seconds = milliseconds / 1000 % 60;
        long minutes = milliseconds / 1000 / 60 % 60;
        long hours = milliseconds / 1000 / 60 / 60 % 24;

        System.out.println(milliseconds);
        System.out.println(hours + " " + minutes + " " + seconds);

        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long time = hours + offset;

        if (time > 12 && time < 24) {
            time -= 12;

            System.out.println("The current time is " + time + ":" + minutes + ":" + seconds + " PM");

        } else if (time <= 12 ^ time >= 24) {
                if (time >= 24) {
                    time -= 24;
                }

            System.out.println("The current time is " + time + ":" + minutes + ":" + seconds + " AM");
        }


    }
}
