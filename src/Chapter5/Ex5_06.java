package Chapter5;

import java.util.Scanner;

public class Ex5_06 {
    public static void main(String[] args) {

        //Conversion from miles to kilometers and kilometers to miles
        Scanner input = new Scanner(System.in);

        int miles = 1;
        int km = 20;
        double milesToKm, kmToMiles;

        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");


        while (miles <= 10 && km <= 65) {
            milesToKm = miles * 1.609;
            kmToMiles = km * .6215;

            System.out.printf("%-2d\t\t\t%-6.3f\t\t|\t%-2d\t\t\t\t%-6.3f\n", miles, milesToKm, km, kmToMiles);

            miles++;
            km+=5;
        }
    }
}
