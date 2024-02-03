package Chapter5;

import java.util.Scanner;

public class Ex5_35 {
    public static void main(String[] args) {

        //Summation
        Scanner input = new Scanner(System.in);

        double sum = 0;

        for (int i = 1; i < 625; i++) {
            sum += 1 / (Math.sqrt(1) + Math.sqrt(i + 1));
        }

        System.out.println(sum);
    }
}
