package Chapter10;

public class MyCharacter {

    private char ch;

    public MyCharacter(char c) {
        ch = c;
    }

    public int compareTo(MyCharacter c) {

        char d = c.toString().charAt(0);

        return ch - d;
    }

    public boolean equals(MyCharacter o) {

        return o.toString().charAt(0) == ch;
    }

    public int getNumericValue() {

        return (int)ch;
    }

    public boolean isDigit(char c) {

        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public MyCharacter valueOf(char c) {

        if (c >= '0' && c <= '9') {
            return new MyCharacter(c);
        }
        else
            return new MyCharacter('0');
    }

    public MyCharacter toUpperCase(char c) {

        if (c >= 'a' && c <= 'z')
            c -= 32;
        else
            return new MyCharacter('0');

        return new MyCharacter(c);
    }

    public String toString() {
        return ch + "";
    }
}
