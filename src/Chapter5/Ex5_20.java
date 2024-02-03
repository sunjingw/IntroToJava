package Chapter5;

import java.util.Scanner;

public class Ex5_20 {
    public static void main(String[] args) {

        //Display prime numbers between 2 and 1000
        Scanner input = new Scanner(System.in);

        int prime = 1;
        int counter = 0;

        for (int i = 2; i < 1000; i++) {

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 1) {
                if (prime % 10 == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");

                prime++;
            }

            counter = 0;

        }
    }
}
