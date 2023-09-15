package Chapter2;

import java.util.Scanner;

public class Ex2_08 {
    public static void main(String[] args) {

        //Current Time
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long hour = Ex2_12_CurrentTime.getCurrentHour(offset);
        long minutes = Ex2_12_CurrentTime.getCurrentMinute();
        long seconds = Ex2_12_CurrentTime.getCurrentSecond();

        System.out.println("The current time is : " + hour + ":" + minutes + ":" + seconds);

    }
}
