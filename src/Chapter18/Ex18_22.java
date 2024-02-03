package Chapter18;

import java.util.*;

public class Ex18_22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(dec2Hex(input.nextInt()));
    }

    public static String dec2Hex(int value) {
        return dec2Hex(value, "");
    }

    public static String dec2Hex (int value, String s) {

        if (value == 0)
            return "";
        else {
            if (value % 16 >= 0 && value % 16 <= 9) {
                s = value % 16 + "";
            } else {
                s = (char)('A' + value % 16 - 10) + "";
            }

            return dec2Hex(value / 16, s) + s;
        }

    }

//    enum Hex {
//        A(10),
//        B(11),
//        C(12),
//        D(13),
//        E(14),
//        F(15);
//        private int hex;
//
//        Hex(int hex) {
//            this.hex = hex;
//        }
//        int returnHex() {
//            return hex;
//        }
//        static String getHex(int value) {
//
//            for (Hex hex : Hex.values()) {
//                if (hex.returnHex() == value) {
//                    return hex.name();
//                }
//
//            }
//            return "";
//        }
//
//    }
}
