package Chapter10;

import java.util.Scanner;

public class Ex10_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyCharacter c = new MyCharacter('A');
        MyCharacter a = new MyCharacter('5');

        System.out.println(c.compareTo(new MyCharacter('B'))); //compare 'A' to 'B' - return -1
        System.out.println(c.equals(new MyCharacter('A'))); //true

        System.out.println(c.getNumericValue()); //return numerical value of char

        System.out.println(c.isDigit('c')); //return true if a digit

        System.out.println(c.valueOf('7').toString()); //return object value of '7'

        System.out.println(c.toUpperCase('c'));
    }
}
