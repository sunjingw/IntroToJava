package Chapter10;

import java.util.Scanner;

public class Ex10_27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MyStringBuilder1 sb = new MyStringBuilder1("AbcAcd");

        System.out.println(sb); //prints string
        System.out.println(sb.append(new MyStringBuilder1("eFGhi"))); //append another string onto original string
        System.out.println(sb.append(5)); //append an integer

        System.out.println(sb.length()); //return length

        System.out.println(sb.charAt(4));

        System.out.println(sb.toLowerCase()); //convert to lowercase and reference the new string object

        System.out.println(sb.substring(3, 6)); //finds the substring of the converted string object w/ lowercase

        System.out.println(sb); //newly referenced string object

        System.out.println(sb.toString());
    }
}
