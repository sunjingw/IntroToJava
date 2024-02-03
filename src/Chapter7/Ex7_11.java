package Chapter7;

import java.util.Scanner;

public class Ex7_11 {
    public static void main(String[] args) {

        //Statistics - compute deviation
        Scanner input = new Scanner(System.in);

        double[] num = new double[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();

        }

        System.out.println("The mean is " + mean(num));

        System.out.println("The standard deviation is " + deviation(num, mean(num)));

    }

    public static double deviation(double[] x, double mean) {

        double std = 0;

        for (int i = 0; i < x.length; i++) {
            std += Math.pow((x[i] - mean), 2);
        }

        return Math.sqrt(std / (x.length - 1));

    }

    public static double mean(double[] x) {

        double mean = 0;

        for (int i = 0; i < x.length; i++) {
            mean += x[i];
        }

        return mean / x.length;
    }
}
