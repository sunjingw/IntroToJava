package Chapter7;

import java.util.Scanner;

public class Ex7_08 {
    public static void main(String[] args) {

        //Average an array
        Scanner input = new Scanner(System.in);


        double[] num = new double[10];

        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }

        System.out.println(average(num));
    }

    //public static int average(int[] array) {

    //}

    public static double average(double[] array) {

        double total = 0;

        for (double e : array) {
            total += e;
        }

        return total / array.length;
    }
}
