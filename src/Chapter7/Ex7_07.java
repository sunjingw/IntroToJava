package Chapter7;

import java.util.Scanner;

public class Ex7_07 {
    public static void main(String[] args) {

        //Count single digits
        Scanner input = new Scanner(System.in);

        int[] counts = new int[10];

        for (int i = 0; i < 100; i++){
            int num = (int)(Math.random() * 10);

            counts[num]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " occurred " + counts[i] + " times");
        }
    }
}
