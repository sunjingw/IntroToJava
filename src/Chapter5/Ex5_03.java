package Chapter5;

import java.util.Scanner;

public class Ex5_03 {
    public static void main(String[] args) {

        //Conversion from kilogram to pounds
        Scanner input = new Scanner(System.in);

        //Display table from 1 kg to 100 kg converted to pounds
        int kg = 1;

        System.out.println("Kilograms\t\tPounds");
        while (kg <= 100) {
            double lb = kg * 2.2;
            System.out.printf("%-3d\t\t\t\t %5.1f\n", kg, lb);
            kg++;
        }

    }
}
