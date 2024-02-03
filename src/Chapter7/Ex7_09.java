package Chapter7;

import java.util.Scanner;

public class Ex7_09 {
    public static void main(String[] args) {

        //Find the smallest element
        Scanner input = new Scanner(System.in);

        double[] num = new double[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }

        System.out.println("The minimum number is " + min(num));
    }

    public static double min(double[] array) {

        double lowest = array[0];

        for (double e : array) {
            if (e < lowest)
                lowest = e;
        }

        return lowest;
    }
}
