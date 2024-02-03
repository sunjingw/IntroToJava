package Chapter10;

import java.util.Scanner;

public class Ex10_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyInteger one = new MyInteger(12);
        MyInteger two = new MyInteger(13);

        System.out.println(one.equals(5));
        System.out.println(one.equals(two));

        System.out.println(one.isEven());
        System.out.println(one.isOdd());
        System.out.println(one.isPrime());
        System.out.println(MyInteger.isEven(two));
        System.out.println(MyInteger.isPrime(13));
        System.out.println(MyInteger.parseInt("141"));

        char[] c = {'1','2','3'};
        System.out.println(MyInteger.parseInt(c));
    }
}
