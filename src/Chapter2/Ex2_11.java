package Chapter2;

import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args) {

        //Population Projection
        Scanner input = new Scanner(System.in);

        //Current population
        final int POPULATION = 312032485;

        //Annual change in population cast into integer
        int annualIncrease = (int)(((86400.0/7) - (86400.0/13) + (86400.0/45)) * 365);

        //Prompt for number of years to calculate
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        //Display the population after X number of years
        System.out.println("The population in " + years + " is " + (POPULATION + (annualIncrease * years)));

    }
}
