package Chapter13;

import java.util.*;

public class Ex13_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calendar cal = new GregorianCalendar();

        System.out.println("Enter month and year: ");
        int month = input.nextInt();
        int year = input.nextInt();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH)); //vary depending on the month
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //first day of the week


        String s = cal.getTime().toString(); //[Sun, May, 01, 10:12:16, EDT, 2016]

        System.out.println(Arrays.toString(s.split(" ")));

        printMonth(cal);
        printDates(cal);
    }

    public static void printMonth(Calendar cal) {
        System.out.println("\t\t\t" + cal.getDisplayName(Calendar.MONTH, cal.getFirstDayOfWeek(), Locale.ENGLISH) + ", " + cal.getWeekYear());
        System.out.println("---------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printDates(Calendar cal) {

        int start = cal.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < start; i++) {
            System.out.print("\t");
        }

        for (int j = 0; j < cal.getActualMaximum(Calendar.DAY_OF_MONTH); j++) {

            System.out.printf("%4d", (j+1));
            if ((j + start) % 7 == 0)
                System.out.println();
        }


    }


}
