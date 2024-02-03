package Chapter18;

import java.util.*;

public class Ex18_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(hex2Dec(input.nextLine()));
    }

    public static int hex2Dec(String hex) {
        return hex2Dec(hex, hex.length() - 1, 0);
    }

    public static int hex2Dec(String hex, int length, int num) {

        if (length < 0)
            return 0;
        else {
            if (hex.charAt(length) >= 'A' && hex.charAt(length) <= 'F') {
                num = (hex.charAt(length) - 'A' + 10) * (int)(Math.pow(16, hex.length() - (length + 1)));
            } else {
                num = Integer.parseInt(hex.charAt(length) + "") * (int)(Math.pow(16, hex.length() - (length + 1)));
            }
            return num + hex2Dec(hex, length - 1, num);
        }
    }
}
