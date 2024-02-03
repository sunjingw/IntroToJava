package Chapter5;

import java.util.Scanner;

public class Ex5_10 {
    public static void main(String[] args) {

        //Find numbers divisible by 5 and 6
        Scanner input = new Scanner(System.in);

        //Numbers 100 to 1000, ten per line, divisible by 5 and 6
        final int PER_LINE = 10;
        int count = 1;

        for (int i = 100; i < 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0) {
                    System.out.print(i + " ");


                if (count % PER_LINE == 0)
                    System.out.println();

                count++;
            }

        }
    }
}
