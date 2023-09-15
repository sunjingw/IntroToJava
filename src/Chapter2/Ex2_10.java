package Chapter2;

import java.util.Scanner;

public class Ex2_10 {
    public static void main(String[] args) {

        //Science - calculating energy
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        System.out.println("Enter the initial temperature :");
        double initTemp = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        double energy = water * (finalTemp - initTemp) * 4184;

        System.out.println("The energy needed is " + energy + " joules");

    }
}
