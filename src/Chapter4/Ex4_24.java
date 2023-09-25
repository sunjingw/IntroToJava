package Chapter4;

import java.util.Scanner;

public class Ex4_24 {
    public static void main(String[] args) {

        //Order three cities
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.println("Enter the third city: ");
        String city3 = input.nextLine();

        if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0) {
            if (city2.compareToIgnoreCase(city3) < 0)
                System.out.println("The three cities in order are " + city1 + " " + city2 + " " + city3);
            else
                System.out.println("The three cities in order are " + city1 + " " + city3 + " " + city2);
        } else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0) {
            if (city1.compareToIgnoreCase(city3) < 0)
                System.out.println("The three cities in order are " + city2 + " " + city1 + " " + city3);
            else
                System.out.println("The three cities in order are " + city2 + " " + city3 + " " + city1);
        } else {
            if (city1.compareToIgnoreCase(city2) < 0)
                System.out.println("The three cities in order are " + city3 + " " + city1 + " " + city2);
            else
                System.out.println("The three cities in order are " + city3 + " " + city2 + " " + city1);
        }
    }
}
