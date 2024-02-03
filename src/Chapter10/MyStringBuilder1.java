package Chapter10;

import java.util.Scanner;

public class MyStringBuilder1 {
    private String str;
    public MyStringBuilder1(String s) {
        str = s;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s) {

        //String str = "";
        //str += this.str + s;

        str += s;

        return new MyStringBuilder1(str);
    }

    public MyStringBuilder1 append(int i) {

        str += i + "";
        return new MyStringBuilder1(str);

    }

    public int length() {

        return str.length();
    }

    public char charAt(int index) {

        return str.charAt(index);
    }
    public MyStringBuilder1 toLowerCase() {

        String lowerCase = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                lowerCase += (char) (str.charAt(i) + (char)32);
            } else
                lowerCase += str.charAt(i);
        }

        this.str = lowerCase;

        return new MyStringBuilder1(this.str);
    }
    public MyStringBuilder1 substring(int begin, int end) {

        String str = "";

        for (int i = begin; i < end; i++) {
            str += this.str.charAt(i);
        }

        return new MyStringBuilder1(str);
    }
    public String toString() {

        return str;
    }

}
