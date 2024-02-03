package Chapter10;

import java.util.Scanner;

public class MyString2 {
    String s;

    public MyString2(String d) {
        this.s = d;
    }
    public int compare(String d) {

        for (int i = 0; i < d.length(); i++) {
            if (this.s.charAt(i) < d.charAt(i)) {
                return -1;
            } else if (this.s.charAt(i) > d.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }

    public MyString2 substring (int begin) {

        String ss = "";
        for (int i = begin; i < s.length(); i++) {
            ss += s.charAt(i);
        }

        return new MyString2(ss);
    }

    public MyString2 toUpperCase() {

        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                ss += (char)(s.charAt(i) - 32);
            } else
                ss += s.charAt(i);
        }

        return new MyString2(ss);
    }

    public char[] toChars() {

        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return chars;
    }

     public static MyString2 valueOf(boolean b) {

        if (b) {
            return new MyString2("true");
        }
        return new MyString2("false");
     }

     public String toString() {
        return s;
     }

     public int length() {
        return s.length();
     }

}
