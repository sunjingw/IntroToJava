package Chapter5;

import java.util.Scanner;

public class Ex5_05 {
    public static void main(String[] args) {

        //Conversion from kilograms to pounds and pounds to kilograms
        Scanner input = new Scanner(System.in);

        int kg = 1;
        int lb = 20;

        System.out.println("Kilograms\tPounds\t\t|\t\tPounds\t Kilograms");

        while (kg < 100 && lb < 250) {
            double kgToLb = kg * 2.2;
            double lbToKg = lb * 0.4545;

            System.out.printf("%-3d\t\t\t%6.1f\t\t|\t\t%-2d\t\t\t%6.2f\n", kg, kgToLb, lb, lbToKg);

            kg++;
            lb+=5;
        }
    }
}
