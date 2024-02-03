package Chapter5;

import java.util.Scanner;

public class Ex5_01 {
    public static void main(String[] args) {

        //Count positive and negative numbers and compute the average of numbers
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer, input ends if it is 0: ");

        int pos = 0;
        int neg = 0;
        double total = 0;

        int num = -1;

        while (num != 0) {
            num = input.nextInt();
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;

            total += num;
        }

        if (pos > 0 || neg > 0) {
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.printf("The total is %2.1f\n", total);
            System.out.printf("The average is %4.2f\n", (total / (pos + neg)));
        } else {
            System.out.println("No numbers are entered except 0");
        }
    }
}
