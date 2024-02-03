package Chapter6;

import java.util.Scanner;

public class Ex6_11 {
    public static void main(String[] args) {

        //Financial application - compute commission
        Scanner input = new Scanner(System.in);

        System.out.println("Sales Amount\t\tCommission");
        computeCommission(10000);
    }

    public static double computeCommission(double salesAmount) {

        double commission = 0;

        for (double i = salesAmount; i <= 100000; i += 5000) {

            commission = 0;

            if (i <= 5000) {
                commission = (salesAmount * 0.08);
            } else if (i <= 10000) {
                commission = (salesAmount - 5000) * 0.08 + (i - 5000) * 0.1;
            } else {
                commission = (5000 * 0.08) + (5000 * 0.1) + (i - 10000) * 0.12;
            }

            System.out.printf("%5.0f\t\t\t\t%3.1f\n", i, commission);

        }

        return commission;
    }
}
