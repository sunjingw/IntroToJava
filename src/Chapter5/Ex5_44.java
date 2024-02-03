package Chapter5;

import java.util.Scanner;

public class Ex5_44 {
    public static void main(String[] args) {

        //Computer architecture - bit-level operations
        Scanner input = new Scanner(System.in);

        //Prompt user for a short integer
        System.out.println("Enter an integer: ");
        short num = input.nextShort();
        short negNum = num;

        //Display 16 bits
        String bits = "";

        for (int i = 0; i < 16; i++) {
            if (num % 2 == 0) {
                bits = "0" + bits;
            } else
                bits = "1" + bits;

            num = (short) (num / 2);
        }

        String invertBits = "";
        String inverted = "";
        if (negNum < 0) {

            for (int i = 0; i < 16; i++) {
                if (bits.substring(i, i + 1).equals("0")) {
                    invertBits = invertBits + "1";
                } else {
                    invertBits = invertBits + "0";
                }
            }

            if (invertBits.substring(invertBits.length() - 1).equals("0")) {
                inverted = invertBits.substring(0, invertBits.length() - 1) + "1";
            } else
                inverted = invertBits.substring(0, invertBits.length() - 1) + "0";

            System.out.println(inverted);
        } else {
            System.out.println(bits);
        }
    }
}
