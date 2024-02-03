package Chapter10;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyString2 s = new MyString2("mySTRing2");

        System.out.println(s.compare("mySTRing2")); //return 0 if same
        System.out.println(s.compare("dySTR")); //return 1 if s is lexicographically greater than new string

        System.out.println(s.substring(3).toString()); //begin at index 3

        System.out.println(s.toUpperCase()); //returns all uppercase

        char[] c = s.toChars(); //initializes a string to character array
        System.out.println(Arrays.toString(c)); //prints the character array

        System.out.println(MyString2.valueOf(true)); //prints string value of boolean variable

    }
}
