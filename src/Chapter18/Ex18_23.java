package Chapter18;

import java.util.*;

public class Ex18_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(bin2Dec(input.nextLine()));
    }

    public static int bin2Dec(String binary) {

        return bin2Dec(binary, binary.length() - 1, 0);

    }

    public static int bin2Dec(String binary, int index, int n) {

        if (index < 0) {
            return 0;
        } else {
            n = Integer.parseInt(binary.charAt(index) + "") * (int)(Math.pow(2, binary.length() - (index + 1)));
            return n + bin2Dec(binary, index - 1, n);
        }
    }
}
