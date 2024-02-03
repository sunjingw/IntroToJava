package Chapter9;

import java.util.Scanner;
import java.util.Date;
public class Ex9_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (long i = 10000; i < 100000000000L; i*=10) {
            Date date = new Date(i);
            System.out.println(date.toString());
        }

    }
}
