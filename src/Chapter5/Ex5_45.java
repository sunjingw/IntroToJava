package Chapter5;

import java.util.Scanner;

public class Ex5_45 {
    public static void main(String[] args) {

        //Statistics - compute mean and standard deviation
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");


        double num = 0;
        double total = 0;

        String std = "";

        for (int i = 0; i < 10; i++) {
            num = input.nextDouble();
            std += num + " ";

            total += num;

            System.out.println("num = " + total);

        }

        double mean = total / 10;

        System.out.println("The mean is " + mean);

        double stdNum = 0;
        int begIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = begIndex; j < std.length(); j++) {
                if (std.charAt(j) == ' ') {
                    endIndex = j;
                    break;
                }
            }

            stdNum += Math.pow(Double.parseDouble(std.substring(begIndex, endIndex)) - mean, 2);

            begIndex = endIndex + 1;

        }
        System.out.println("The standard deviation is " + Math.pow(stdNum / 10, 0.5));
    }
}
