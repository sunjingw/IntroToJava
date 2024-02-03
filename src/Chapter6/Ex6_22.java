package Chapter6;

import java.util.Scanner;

public class Ex6_22 {
    public static void main(String[] args) {

        //Math - approximate the square root
        Scanner input = new Scanner(System.in);

        System.out.println(sqrt(5));
    }

    public static double sqrt(long n) {

        double nextGuess = 0;
        double lastGuess = 1;

        boolean isApproximate = true;

        while(isApproximate) {

            nextGuess = (lastGuess + n / lastGuess) / 2;

            if (Math.abs(lastGuess - nextGuess) < 0.0001) {
                isApproximate = false;
                break;
            }
            else
                isApproximate = true;

            lastGuess = nextGuess;

        }
        return nextGuess;
    }
}
