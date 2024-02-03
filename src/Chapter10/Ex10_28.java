package Chapter10;

import java.util.Scanner;

public class Ex10_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = "aaabbCCDDee";
        MyStringBuilder2 sb = new MyStringBuilder2("aabbCCDee");

        char[] c = {'A','b','d','E','d'};
        MyStringBuilder2 cb = new MyStringBuilder2(c);

        System.out.println(sb);
        //System.out.println(c);

        System.out.println(sb.insert(4, new MyStringBuilder2("xxYYzz"))); //insert string at index 4

        System.out.println(sb); //references the new reference with the inserted string

        System.out.println(sb.reverse());

        System.out.println(sb); //references the reversed string

        System.out.println(sb.substring(5));

        System.out.println(sb.toUpperCase());

        System.out.println(sb); //references the uppercase/reversed string w/ substring at 5
    }
}
