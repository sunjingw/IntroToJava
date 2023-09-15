package Chapter2;

public class Ex2_12_CurrentTime {
    public static void main(String[] args) {

        long milliSeconds = System.currentTimeMillis(); //Time since 01-01-1970 00:00:00 GMT UNIX epoch
        long totalSeconds = milliSeconds / 1000; //Time in total seconds
        long totalMinutes = totalSeconds / 60; //Time in total minutes
        long totalHours = totalMinutes / 60; //Time in total hours

        System.out.println(System.currentTimeMillis());

        System.out.println("Current Time is: " + totalHours % 24 + ":" + totalMinutes % 60 + ":" + totalSeconds % 60 +
                " GMT");
        System.out.println("Current Time is: " + getCurrentHour( -4) + ":" + totalMinutes % 60 + ":" + totalSeconds % 60 +
                " EST");

    }

    //Creating getter methods for Ex 2.8
    public static long getCurrentHour (int offset) {

        return ((System.currentTimeMillis() / 1000 / 60 / 60) % 24) + offset;
    }

    public static long getCurrentMinute () {

        return (System.currentTimeMillis() / 1000 / 60) % 60;
    }
    public static long getCurrentSecond () {

        return (System.currentTimeMillis() / 1000) % 60;
    }
}
