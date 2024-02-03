package Chapter9;

import java.util.Scanner;
import java.util.GregorianCalendar;
public class Ex9_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.println(calendar.get(GregorianCalendar.MONTH));
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.println(calendar.get(GregorianCalendar.MONTH));
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
