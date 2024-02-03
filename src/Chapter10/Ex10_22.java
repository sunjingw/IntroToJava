package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[] chars = {'A','B','c','d','2'};

        MyString1 test = new MyString1(chars);

        System.out.println(test.charAt(3)); //find the character at index 3

        System.out.println(test.length()); //find the length of the character array

        System.out.println(MyString1.valueOf(1221)); //find the value of integer

        System.out.println(test.substring(2,5).toString()); //display substring

        System.out.println(test.equals(new MyString1(new char[]{'A', 'B'}))); //test if the char array is equal to the argument in terms of content
        System.out.println(test.equals(new MyString1(new char[]{'A','B','c','d','2'}))); //returns true

        System.out.println(test.toLowerCase().toString()); //convert to all lower case
        System.out.println(test.equals(new MyString1(new char[]{'A','B','c','d','2'}))); //returns false since char array is now all lower case


    }
}
