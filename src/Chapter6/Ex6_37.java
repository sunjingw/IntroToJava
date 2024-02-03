package Chapter6;

import java.util.Scanner;

public class Ex6_37 {
    public static void main(String[] args) {

        //Format an integer
        Scanner input = new Scanner(System.in);

        System.out.println(format(34,1));

    }

    public static String format(int number, int width) {

        String num = number + "";

        int size = width - num.length();

        if (width <= num.length()) {
            return num;
        } else {
            for (int i = 0; i < size; i++) {
                num = "0" + num;
            }
            return num;
        }
    }

}
