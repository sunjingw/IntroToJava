package Chapter7;

import java.util.Scanner;

public class Ex7_33 {
    public static void main(String[] args) {

        //Culture - chinese zodiac
        Scanner input = new Scanner(System.in);


        String[] zodiac = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println(zodiac[year % 12]);
    }
}
