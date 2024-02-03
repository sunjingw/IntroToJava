package Chapter18;

import java.util.*;

public class Ex18_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(dec2Bin(input.nextInt()));
    }

    public static String dec2Bin(int value) {

        return dec2Bin(value, "");

    }

    public static String dec2Bin(int value, String s) {

        if (value == 0) {
            return s;
        } else {
            return dec2Bin(value / 2, (value % 2 == 0 ? "0" : "1") + s);

        }
    }
}
