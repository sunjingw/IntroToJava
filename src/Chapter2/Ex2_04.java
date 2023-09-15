package Chapter2;

import java.util.Scanner;

public class Ex2_04 {
    public static void main(String[] args) {

        //Convert  pound into kilograms
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");

        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
