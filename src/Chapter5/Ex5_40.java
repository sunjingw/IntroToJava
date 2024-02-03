package Chapter5;

import java.util.Scanner;

public class Ex5_40 {
    public static void main(String[] args) {

        //Simulation - heads or tails
        Scanner input = new Scanner(System.in);

        //Simulate flipping a coin a million times and displays number of heads and tails
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000000; i++) {
            int flip = (int)(Math.random() * 2);

            if (flip == 0)
                heads++;
            else
                tails++;

        }

        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
    }
}
