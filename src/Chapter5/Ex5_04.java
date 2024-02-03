package Chapter5;

import java.util.Scanner;

public class Ex5_04 {
    public static void main(String[] args) {

        //Conversion from miles to kilometers
        Scanner input = new Scanner(System.in);

        //Display table from miles to kilometers

        int miles = 1;

        System.out.println("Miles\t\t Kilometers");
        while (miles <= 10) {
            double km = miles * 1.609;
            System.out.printf("%-2d\t\t\t %-5.3f\n", miles, km);
            miles++;
        }
    }
}
