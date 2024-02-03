package Chapter10;

import java.util.Scanner;

public class Ex10_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Time t1 = new Time();
        System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());

        Time t2 = new Time(555550000);
        System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

        Time t3 = new Time(1, 1, 1);
        System.out.println(t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());
    }
}
