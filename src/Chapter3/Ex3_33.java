package Chapter3;

import java.util.Scanner;

public class Ex3_33 {
    public static void main(String[] args) {

        //Financial - compare costs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.println("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double p1 = price1 / weight1;
        double p2 = price2 / weight2;

        if (p1 < p2) {
            System.out.println("Package 1 has a better price");
        } else if (p2 < p1) {
            System.out.println("Package 2 has a better price");
        } else {
            System.out.println("The packages have the same price");
        }
    }
}
