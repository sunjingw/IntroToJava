package Chapter10;

import java.util.Scanner;

public class Ex10_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(561555550000L);

        System.out.println(d1.getYear() + "-" + d1.getMonth() + "-" + d1.getDay());
        System.out.println(d2.getYear() + "-" + d2.getMonth() + "-" + d2.getDay());
    }
}
