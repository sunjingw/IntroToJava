package Chapter10;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {

        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {

        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] c = new char[end - begin];

        for (int i = begin; i < end; i++) {

            c[i - begin] = chars[i];

        }

        return new MyString1(c);
    }

    public MyString1 toLowerCase() {

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += ' ';
            }
        }

        return new MyString1(chars);
    }

    public boolean equals(MyString1 s) {

        if (chars.length != s.length()) {
            return false;
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (s.charAt(i) != chars[i]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static MyString1 valueOf(int i) {
        String s = i + "";
        char[] c = new char[s.length()];

        for (int a = 0; a < s.length(); a++) {
            c[a] = s.charAt(a);
        }

        return new MyString1(c);
    }

    public String toString() {

        String s = "";

        for (char c : chars) {
            s += c + "";
        }

        return s;
    }
}
