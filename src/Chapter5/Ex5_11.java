package Chapter5;

import java.util.Scanner;

public class Ex5_11 {
    public static void main(String[] args) {

        //Find numbers divisible by 5 or 6, but not both
        Scanner input = new Scanner(System.in);

        int count = 1;

        for (int i = 100; i < 200; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i + " ");

                if (count % 10 == 0) {
                    System.out.println();
                }
                count++;
            }
        }
    }
}
