package Chapter10;

import java.util.Scanner;

public class MyStringBuilder2 {

    private char[] chars;
    private String s;

    public MyStringBuilder2() {

    }

    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
    }

    public MyStringBuilder2(String s) {
        this.s = s;
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {

        String s1 = "";
        String s2 = "";

        if (offset > 0 && offset < this.s.length()) {
             s1 = this.s.substring(0, offset);
             s2 = this.s.substring(offset, this.s.length());
             this.s = s1 + s + s2;
        }  else if (offset > this.s.length()) {
            this.s += s;
        } else
            this.s = s + this.s;

        return new MyStringBuilder2(this.s);

    }
    public MyStringBuilder2 reverse() {

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        this.s = reverse;
        return new MyStringBuilder2(s);
    }
    public MyStringBuilder2 substring(int begin) {

        String s = "";

        for (int i = begin; i < this.s.length(); i++) {
            s += this.s.charAt(i);
        }
        this.s = s;
        return new MyStringBuilder2(this.s);
    }
    public MyStringBuilder2 toUpperCase() {

        String s = "";

        for (int i = 0; i < this.s.length(); i++) {

            if (this.s.charAt(i) >= 'a' && this.s.charAt(i) <= 'z') {
                s += (char)(this.s.charAt(i) - 32);
            } else
                s += this.s.charAt(i);
        }

        this.s = s;

        return new MyStringBuilder2(this.s);

    }

    public String toString() {
        return s;
    }
}
